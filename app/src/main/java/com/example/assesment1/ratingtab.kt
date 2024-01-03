package com.example.assesment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.adapters.ViewPagerAdapter

class ratingtab : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ratingtab)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        val adapter = adapterpager(supportFragmentManager, 3) // 3 is the number of tabs
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)

        val imageBack = findViewById<ImageView>(R.id.back)
        imageBack.setOnClickListener {
            val intpindah =
                Intent(this, MainActivity::class.java)
            startActivity(intpindah)
        }
    }

}
