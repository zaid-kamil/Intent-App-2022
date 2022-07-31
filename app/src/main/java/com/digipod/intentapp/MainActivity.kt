package com.digipod.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnShowForm: Button
    private lateinit var btnLaunchSplash: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // initialize the buttons
        btnShowForm = findViewById(R.id.btnShowForm)
        btnLaunchSplash = findViewById(R.id.btnLaunchSplash)
        // set the onClickListener for the buttons
        btnShowForm.setOnClickListener {
            val i = Intent(this, FormActivity::class.java)
            startActivity(i)
        }
        btnLaunchSplash.setOnClickListener {
            val i = Intent(this, SplashActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}