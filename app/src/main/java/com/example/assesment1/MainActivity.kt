package com.example.assesment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Spinner
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageBack = findViewById<ImageView>(R.id.back)
        imageBack.setOnClickListener{
            val intpindah =
                Intent (this,activity_login ::class.java)
            startActivity(intpindah)
        }

        val city = arrayOf("Newest", "Popular", "Hottest", "Most Viewed", "Most Reviewed")

        val spinner = findViewById<Spinner>(R.id.spinnercategory)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int, // Parameter for the selected item's position
                id: Long // Parameter for the selected item's ID
            ) {
                // Your code to handle item selection here
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle the case where nothing is selected (optional)
            }
        }
        val otwmirev = findViewById<androidx.cardview.widget.CardView>(R.id.rec3)
        otwmirev.setOnClickListener{
            val intgo =
                Intent (this,activity_mirev ::class.java)
            startActivity(intgo)
        }

        val otwReview = findViewById<androidx.cardview.widget.CardView>(R.id.card)
        otwReview.setOnClickListener{
            val intpindah =
                Intent (this,activity_review ::class.java)
            startActivity(intpindah)
        }

        val otwTriv = findViewById<RelativeLayout>(R.id.triv)
        otwTriv.setOnClickListener{
            val intpindah =
                Intent (this,activity_trivia ::class.java)
            startActivity(intpindah)
        }

        val otwProfile = findViewById<ImageView>(R.id.goProf)
        otwProfile.setOnClickListener{
            val intmain =
                Intent (this,activity_profile ::class.java)
            startActivity(intmain)
        }

        val otwSubmit = findViewById<RelativeLayout>(R.id.submitrev)
        otwSubmit.setOnClickListener{
            val intmain =
                Intent (this,activity_submit ::class.java)
            startActivity(intmain)
        }
        val otwDev = findViewById<CardView>(R.id.cardDev)
        otwDev.setOnClickListener {
            val intmain =
                Intent(this, activity_devs::class.java)
            startActivity(intmain)
        }

        val otwLists = findViewById<RelativeLayout>(R.id.listmov)
        otwLists.setOnClickListener {
            val intmain =
                Intent(this, activity_listview::class.java)
            startActivity(intmain)
        }

        val otwRate = findViewById<RelativeLayout>(R.id.rattab)
        otwRate.setOnClickListener {
            val intmain =
                Intent(this, ratingtab::class.java)
            startActivity(intmain)
        }

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.bubgump, "Life is like a box of chocolate..."))
        imageList.add(SlideModel(R.drawable.getout, "Run..."))
        imageList.add(SlideModel(R.drawable.batmanrev, "Fear is a tool..."))
        imageList.add(SlideModel(R.drawable.devhalu, "Aamiin Ya Allah..."))
        imageList.add(SlideModel(R.drawable.miposta, "Dun Dun, Dun Dun, Dun Dun ..."))

        val imageSlider = findViewById<ImageSlider>(R.id.imageser)
        imageSlider.setImageList(imageList)



    }
}