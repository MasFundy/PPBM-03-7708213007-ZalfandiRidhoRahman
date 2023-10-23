package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_submit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        val imageBack = findViewById<ImageView>(R.id.back)
        imageBack.setOnClickListener {
            val intpindah =
                Intent(this, MainActivity::class.java)
            startActivity(intpindah)
        }
        val submitted = findViewById<Button>(R.id.submit)
        submitted.setOnClickListener {
            val intpindah =
                Intent(this, MainActivity::class.java)
            startActivity(intpindah)
        }
    }

}