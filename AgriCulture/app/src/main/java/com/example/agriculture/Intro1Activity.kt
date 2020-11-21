package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intro1.*

class Intro1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro1)

        buttonNext.setOnClickListener() {
            mudarParaActivity()
        }
    }

        private fun mudarParaActivity() {
            val intent = Intent(this, Intro2Activity::class.java)
            startActivity(intent)
        }
}