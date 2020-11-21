package com.example.agriculture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class DuvidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duvida)

        val textoDuvida = findViewById<EditText>(R.id.duvida)

        val botaoConsultar = findViewById<Button>(R.id.consultar)

        botaoConsultar.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Consultando... " + textoDuvida.text,
                Toast.LENGTH_LONG
            ).show()
        }
    }
}