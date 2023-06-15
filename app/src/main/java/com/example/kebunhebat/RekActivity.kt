package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rek)

        val btnBack = findViewById<ImageView>(R.id.img_back)
        val tvAddRek = findViewById<TextView>(R.id.tv_addrek)

        btnBack.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        tvAddRek.setOnClickListener{
            startActivity(Intent(this, AddRekActivity::class.java))
        }
    }
}