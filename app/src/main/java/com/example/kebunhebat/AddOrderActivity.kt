package com.example.kebunhebat


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AddOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_order)

        val btnEnter = findViewById<Button>(R.id.btn_enter)
        val btnBack = findViewById<ImageView>(R.id.img_back)

        btnBack.setOnClickListener{
            startActivity(Intent(this, OnGoingActivity::class.java))
        }
        btnEnter.setOnClickListener{
            startActivity(Intent(this, IdOrderActivity::class.java))
        }
    }
}