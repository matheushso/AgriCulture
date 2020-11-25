package com.example.agriculture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mudarParaActivityDuvida()
    }

    private fun mudarParaActivityDuvida() {
        val intent = Intent(this, Intro1Activity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 2000)
    }

    fun Intent.change() {
        startActivity(this)
        finish()
    }
}