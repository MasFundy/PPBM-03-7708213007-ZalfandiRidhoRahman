package com.example.assesment1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ncorti.slidetoact.SlideToActView
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class activity_submit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        val imageBack = findViewById<ImageView>(R.id.back)
        imageBack.setOnClickListener {
            val intpindah = Intent(this, MainActivity::class.java)
            startActivity(intpindah)
        }

        val submitted = findViewById<SlideToActView>(R.id.submitt)
        submitted.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val dialog = BottomSheetDialog(this@activity_submit)
                val bottomSheetView = layoutInflater.inflate(R.layout.activity_bottomsheet, null)
                dialog.setContentView(bottomSheetView)
                dialog.show()

                // Add a delay of 3 seconds before navigating to MainActivity
                Handler(Looper.getMainLooper()).postDelayed({
                    val pintomain = Intent(this@activity_submit, MainActivity::class.java)
                    startActivity(pintomain)
                }, 3000) // 3000 milliseconds = 3 seconds
            }
        }
    }
}
