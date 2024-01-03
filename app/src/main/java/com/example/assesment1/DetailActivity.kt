package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Mengambil data ekstra dari Intent
        val nama = intent.getStringExtra("nama")
        val desc = intent.getStringExtra("desc")
        val fotoResId = intent.getIntExtra("foto", 0)

        // Menampilkan data di TextView dan ImageView
        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val descTextView = findViewById<TextView>(R.id.descTextView)
        val fotoImageView = findViewById<ImageView>(R.id.fotoImageView)

        namaTextView.text = nama
        descTextView.text = desc
        fotoImageView.setImageResource(fotoResId)

        val imageBack = findViewById<ImageView>(R.id.back)
        imageBack.setOnClickListener {
            val intpindah =
                Intent(this, activity_listview::class.java)
            startActivity(intpindah)
        }
        }
}