package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AddRekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_rek)

        val btnBack = findViewById<ImageView>(R.id.img_back)
        val btnEnter = findViewById<Button>(R.id.btn_enter)

        btnBack.setOnClickListener{
            startActivity(Intent(this, RekActivity::class.java))
        }
        btnEnter.setOnClickListener{
            startActivity(Intent(this,ListRekActivity::class.java))
        }
    }
}