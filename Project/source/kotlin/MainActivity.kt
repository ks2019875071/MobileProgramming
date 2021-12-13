package com.example.kotlinapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnHeal = findViewById<Button>(R.id.btnHealth)
        val btnStr = findViewById<Button>(R.id.btnStretch)
        val btnExit = findViewById<Button>(R.id.btnExit)
        val btnMe = findViewById<Button>(R.id.btnMe)

        btnHome.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, HomeFragment())
                .commit()
        }
        btnHeal.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, HealthFragment())
                .commit()
        }
        btnStr.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, StretchFragment())
                .commit()
        }
        btnMe.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, MeFragment())
                .commit()
        }
        btnExit.setOnClickListener {
            // 현재 액티비티를 종료시킨다.
            finish()
        }
    }

}