package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AddAddressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_address)

        val btnBack = findViewById<ImageView>(R.id.img_back)
        val btnEnter = findViewById<Button>(R.id.btn_enter)

        btnBack.setOnClickListener{
            startActivity(Intent(this, AddressActivity::class.java))
        }
        btnEnter.setOnClickListener{
            startActivity(Intent(this,ListAddressActivity::class.java))
        }
    }
}