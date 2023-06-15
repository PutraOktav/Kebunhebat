package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        val btnBack = findViewById<ImageView>(R.id.img_back)
        val tvAddaLmt = findViewById<TextView>(R.id.tv_addlmt)

        btnBack.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        tvAddaLmt.setOnClickListener{
            startActivity(Intent(this, AddAddressActivity::class.java))
        }

    }
}