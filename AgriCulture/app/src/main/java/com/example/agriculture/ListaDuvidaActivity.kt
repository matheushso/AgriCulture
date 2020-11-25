package com.example.agriculture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import org.jetbrains.anko.db.parseList
import org.jetbrains.anko.db.rowParser
import org.jetbrains.anko.db.select

class ListaDuvidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_duvida)

        val duvidasAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        val list = findViewById<ListView>(R.id.list_view_duvidas);
        list.adapter = duvidasAdapter

        duvidasAdapter.add("Item 1")
        duvidasAdapter.add("Item 2")

        database.use {
            select("duvida").exec {
                val parser = rowParser() { id: Int,
                                           duvida: String ->
                    Duvida(id, duvida)
                }
                var listaDuvidas = parseList(parser)

                duvidasAdapter.clear()
                val duvidasTexto = listaDuvidas.map { it.duvida }
                duvidasAdapter.addAll(duvidasTexto)
            }
        }
    }
}