package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_choose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val otwLogin = findViewById<Button>(R.id.loginchoose)
        otwLogin.setOnClickListener {
            val intmain =
                Intent(this, activity_login::class.java)
            startActivity(intmain)
        }
        val otwSignup = findViewById<Button>(R.id.signupchoose)
        otwSignup.setOnClickListener {
            val intmain =
                Intent(this, activity_signup::class.java)
            startActivity(intmain)
        }
    }
}