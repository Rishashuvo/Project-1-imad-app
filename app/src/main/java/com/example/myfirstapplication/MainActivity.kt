package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val numberEditText = findViewById<EditText>(R.id.editTextText2)

        button.setOnClickListener {
            val userInputString = numberEditText.text.toString()
            // Check if the input is a number
            if (userInputString.matches("-?\\d+(\\.\\d+)?".toRegex())) {
                val userInput = userInputString.toInt()
                // Check if the number is within the range 0 to 10
                if (userInput in 0..10) {
                    val intent: Intent? = if (userInput == 0) {
                        Intent(this, MainActivity2::class.java)
                    } else if (userInput == 1) {
                        Intent(this, MainActivity3::class.java)
                    } else if (userInput == 2) {
                        Intent(this, MainActivity4::class.java)
                    } else if (userInput == 3) {
                        Intent(this, MainActivity5::class.java)
                    } else if (userInput == 4) {
                        Intent(this, MainActivity6::class.java)
                    } else if (userInput == 5) {
                        Intent(this, MainActivity7::class.java)
                    } else if (userInput == 6) {
                        Intent(this, MainActivity8::class.java)
                    } else if (userInput == 7) {
                        Intent(this, MainActivity9::class.java)
                    } else if (userInput in 8..10) {
                        Intent(this, MainActivity10::class.java)
                    } else {
                        null
                    }

                    intent?.let { startActivity(it) }
                } else {
                    Toast.makeText(
                        this,
                        "Please enter a number between 0 and 10",
                        Toast.LENGTH_LONG
                    ).show()
                }
            } else {
                Toast.makeText(this, "WRONG. Please enter a number.", Toast.LENGTH_LONG).show()
            }
        }
    }
}

