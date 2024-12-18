package com.example.transportepublico1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class AlertasActivity : AppCompatActivity() {

    private val busAlerts = listOf(
        "Bus 1 llegará en 5 minutos",
        "Bus 2 llegará en 10 minutos",
        "Bus 3 llegará en 15 minutos"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertas)

        val listViewAlertas: ListView = findViewById(R.id.listview_alertas)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, busAlerts)
        listViewAlertas.adapter = adapter

        val buttonBackToMain: Button = findViewById(R.id.button_back_to_main)
        buttonBackToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}