package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val tvrgs = findViewById<TextView>(R.id.tv_rgs)

        btnLogin.setOnClickListener {
           startActivity(Intent(this, OnGoingActivity::class.java))
        }

        tvrgs.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }


    }
}