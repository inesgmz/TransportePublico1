package com.example.transportepublico1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HorariosActivity : AppCompatActivity() {

    private val busSchedules = mapOf(
        "Bus 1" to "Schedule for Bus 1: 6:00 AM - 10:00 PM",
        "Bus 2" to "Schedule for Bus 2: 7:00 AM - 9:00 PM",
        "Bus 3" to "Schedule for Bus 3: 8:00 AM - 8:00 PM"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horarios)

        val spinnerBuses: Spinner = findViewById(R.id.spinner_buses)
        val textViewSchedule: TextView = findViewById(R.id.textview_schedule)
        val buttonBackToMain: Button = findViewById(R.id.button_back_to_main)

        val busNames = busSchedules.keys.toList()
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, busNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerBuses.adapter = adapter

        spinnerBuses.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedBus = busNames[position]
                textViewSchedule.text = busSchedules[selectedBus]
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                textViewSchedule.text = "Select a bus to see its schedule"
            }
        }

        buttonBackToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}