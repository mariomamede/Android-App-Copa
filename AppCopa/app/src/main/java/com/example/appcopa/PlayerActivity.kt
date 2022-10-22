package com.example.appcopa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        if(selectedPlayer != -1) {
            if (selectedTeam == "Brasil"){
                updateJogador(JogadoresBrasil[selectedPlayer])
            }
            else if (selectedTeam == "Sérvia"){
                updateJogador(JogadoresServia[selectedPlayer])
            }
            else if (selectedTeam == "Suiça"){
                updateJogador(JogadoresSuica[selectedPlayer])
            }
            else if (selectedTeam == "Camarões"){
                updateJogador(JogadoresCamaroes[selectedPlayer])
            }
        }

    }

    fun updateJogador(jogador: Jogador){
        findViewById<ImageView>(R.id.player_photo).setImageResource(jogador.imageId);
        findViewById<TextView>(R.id.player_name).text = jogador.nome
        findViewById<TextView>(R.id.player_idade).text = "Idade: " + jogador.idade
        findViewById<TextView>(R.id.player_posicao).text = jogador.posicao
        findViewById<TextView>(R.id.player_naturalidade).text = "Naturalidade: " + jogador.cidade
        findViewById<TextView>(R.id.player_camisa).text = "Camisa: " + jogador.camisa
        findViewById<TextView>(R.id.player_titulos).text = jogador.titulos
        findViewById<TextView>(R.id.player_clubes).text = jogador.clubes
        findViewById<TextView>(R.id.player_worldcup).text = jogador.worldcup
    }
}