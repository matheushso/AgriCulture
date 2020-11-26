package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intro2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro2)

        val buttonNext = findViewById<Button>(R.id.buttonNext);
        buttonNext.setOnClickListener(){
            val intent = Intent(this, DuvidaActivity::class.java)
            startActivity(intent)
        }
        val buttonPrevious = findViewById<Button>(R.id.buttonPrevious);
        buttonPrevious.setOnClickListener(){
            val intent = Intent(this, Intro1Activity::class.java)
            startActivity(intent)
        }
    }
}