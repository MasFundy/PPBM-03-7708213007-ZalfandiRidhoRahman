package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val imageBack = findViewById<ImageView>(R.id.backtochoose)
        imageBack.setOnClickListener{
            val intmain =
                Intent (this,activity_choose ::class.java)
            startActivity(intmain)
        }

        val loginLagi = findViewById<Button>(R.id.signup)
        loginLagi.setOnClickListener{
            val intmain =
                Intent (this,activity_login ::class.java)
            startActivity(intmain)
        }
    }
}