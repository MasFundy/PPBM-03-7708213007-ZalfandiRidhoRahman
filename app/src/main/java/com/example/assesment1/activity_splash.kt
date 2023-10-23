package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class activity_splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animBrush = findViewById<ImageView>(R.id.brushsplash)
        animBrush.animate().apply {
            duration = 1500
            rotationYBy(360f)
        }.withEndAction{

            animBrush.animate().apply {
                duration = 1500
                rotationXBy(360f)
            }
        }
        Handler().postDelayed({
            startActivity(Intent(this, activity_choose::class.java))
            finish()
        }, 4000)
    }
}
