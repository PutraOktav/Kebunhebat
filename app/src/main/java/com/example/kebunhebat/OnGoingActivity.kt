package com.example.kebunhebat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class OnGoingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_going)

        val imgOngoing1 = findViewById<View>(R.id.img_ongoing_1)
        val imgOngoing2 = findViewById<View>(R.id.img_ongoing_2)
        val imgOngoing3 = findViewById<View>(R.id.img_ongoing_3)
        val icHome = findViewById<ImageView>(R.id.ic_home)
        val icAddOrder = findViewById<ImageView>(R.id.ic_addorder)
        val icUser = findViewById<ImageView>(R.id.ic_user)
        val History = findViewById<TextView>(R.id.tv_history)

        imgOngoing1.setOnClickListener{
            startActivity(Intent(this, TrackingActivity::class.java))
        }
        imgOngoing2.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }
        imgOngoing3.setOnClickListener {
            startActivity(Intent(this, TrackingActivity::class.java))
        }

        icHome.setOnClickListener{
            startActivity(Intent(this, OnGoingActivity::class.java))
        }
        icUser.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        icAddOrder.setOnClickListener{
            startActivity(Intent(this, AddOrderActivity::class.java))
        }

        History.setOnClickListener{
            startActivity(Intent(this, HistoryActivity::class.java))
        }




    }
}