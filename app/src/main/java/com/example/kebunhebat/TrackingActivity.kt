package com.example.kebunhebat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView

class TrackingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracking)

        val btnQr = findViewById<Button>(R.id.btn_qr)
        val btnBack = findViewById<ImageView>(R.id.btn_back)

        btnQr.setOnClickListener{
            startActivity(Intent(this, QRActivity::class.java))
        }

        btnBack.setOnClickListener{
            startActivity(Intent(this, OnGoingActivity::class.java))
        }

    }
}