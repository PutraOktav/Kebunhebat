package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<Button>(R.id.btn_register)
        val tvRgs = findViewById<TextView>(R.id.tv_rgs)

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegProfileActivity::class.java))
        }

        tvRgs.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}