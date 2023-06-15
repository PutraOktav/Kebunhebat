package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnBack = findViewById<ImageView>(R.id.img_back)
        val imgFarm = findViewById<ImageView>(R.id.img_farm)
        val imgBank = findViewById<ImageView>(R.id.img_bank)

        btnBack.setOnClickListener{
            startActivity(Intent(this, OnGoingActivity::class.java))
        }

        imgFarm.setOnClickListener{
            startActivity(Intent(this,AddressActivity::class.java))
        }

        imgBank.setOnClickListener{
            startActivity(Intent(this, RekActivity::class.java))
        }

    }
}