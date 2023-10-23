package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val imageLogin = findViewById<Button>(R.id.login)
        imageLogin.setOnClickListener{
            val intmain =
                Intent (this,MainActivity ::class.java)
            startActivity(intmain)
        }

        val imageBack = findViewById<ImageView>(R.id.backtochoose)
        imageBack.setOnClickListener{
            val intmain =
                Intent (this,activity_choose ::class.java)
            startActivity(intmain)
        }
    }
}