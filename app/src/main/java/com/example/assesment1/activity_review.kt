package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class activity_review : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val balikMain = findViewById<ImageView>(R.id.back)
        balikMain.setOnClickListener{
            val intpindah =
                Intent (this,MainActivity ::class.java)
            startActivity(intpindah)
        }
    }
}