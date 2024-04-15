package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val retuning = findViewById<Button>(R.id.button2)
        retuning.setOnClickListener { val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)}
    }
}