package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro2.*

class Intro2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro2)

        buttonNext.setOnClickListener() {
            val intent = Intent(this, DuvidaActivity::class.java)
            startActivity(intent)
        }
        buttonPrevious.setOnClickListener() {
            val intent = Intent(this, Intro1Activity::class.java)
            startActivity(intent)
        }
    }

    private fun mudarParaActivity() {

    }
}