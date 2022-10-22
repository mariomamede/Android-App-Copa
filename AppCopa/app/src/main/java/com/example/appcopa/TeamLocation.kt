package com.example.appcopa

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TeamLocation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_location)

        var selectedList: MutableList<Jogador> = JogadoresBrasil

        if (selectedTeam == "Brasil"){
            selectedList = JogadoresBrasil
        }
        else if (selectedTeam == "Sérvia"){
            selectedList = JogadoresServia
        }
        else if (selectedTeam == "Suiça"){
            selectedList = JogadoresSuica
        }
        else if (selectedTeam == "Camarões"){
            selectedList = JogadoresCamaroes
        }

        // loop dos 11 jogadores
        for (i in 0..10) {
            // obter o resources id de cada jogador
            val resID = resources.getIdentifier("jogador_" + i, "id", packageName)
            // obter a view do jogador
            val viwer = findViewById<TextView>(resID)
            // atualiza o nome do jogador
            viwer.text = selectedList[i].nome.split(" ")[0]
            // pega a drawable (foto do jogador) e armazena em uma variavel
            val drawable = getDrawable(selectedList[i].imageId);
            // verifica se a variavel é nula
            if (drawable != null) {
                // define o tamanho máximo da imagem
                drawable.setBounds(0, 0, 100, 100)
                // atualiza a compound drawables do jogador (foto do jogador acima do nome)
                viwer.setCompoundDrawables(null,drawable,null,null)
            }
        }
    }

    // ShowPlayer, função chamada na onClick de cada jogador
    fun ShowPlayer(v: View){
        // obtem o resources id do jogador que foi clicado
        val s = v.getResources().getResourceEntryName(v.getId());
        // obtem o index do jogador a partir do resources id
        // guarda na variavel global selectedPlayer
        selectedPlayer = s.substring(8, s.length).toInt()
        // troca activity
        val intent = Intent(this, PlayerActivity::class.java)
        startActivity(intent)
    }
}