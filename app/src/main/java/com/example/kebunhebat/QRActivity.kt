package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class QRActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qractivity)

        val btnBack = findViewById<ImageView>(R.id.img_back)

        btnBack.setOnClickListener{
            startActivity(Intent(this, OnGoingActivity::class.java))
        }
    }
}