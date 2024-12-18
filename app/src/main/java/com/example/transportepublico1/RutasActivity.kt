package com.example.transportepublico1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class RutasActivity : AppCompatActivity() {

    private val busRoutes = listOf(
        "Ruta de Bus 1: Parada A -> Parada B -> Parada C",
        "Ruta de Bus 2: Parada D -> Parada E -> Parada F",
        "Ruta de Bus 3: Parada G -> Parada H -> Parada I"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rutas)

        val listViewRutas: ListView = findViewById(R.id.listview_rutas)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, busRoutes)
        listViewRutas.adapter = adapter

        val buttonBackToMain: Button = findViewById(R.id.button_back_to_main)
        buttonBackToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}