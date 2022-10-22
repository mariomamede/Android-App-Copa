package com.example.appcopa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (x in arrayOf(R.id.btn_brasil, R.id.btn_servia, R.id.btn_suica, R.id.btn_camaroes))
        {
            val click = findViewById<Button>(x);
            click.setOnClickListener {
                selectedTeam = click.text.toString();
                val intent = Intent(this, TeamLocation::class.java)
                startActivity(intent)
            }
        }
    }
}