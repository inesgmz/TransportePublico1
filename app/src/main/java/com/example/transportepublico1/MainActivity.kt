package com.example.transportepublico1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Transporte Público"

        findViewById<Button>(R.id.button_horarios).setOnClickListener {
            startActivity(Intent(this, HorariosActivity::class.java))
        }
        findViewById<Button>(R.id.button_alertas).setOnClickListener {
            startActivity(Intent(this, AlertasActivity::class.java))
        }
        findViewById<Button>(R.id.button_rutas).setOnClickListener {
            startActivity(Intent(this, RutasActivity::class.java))
        }
    }
}