// SecondActivity.kt
package com.example.midtermBtueasy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.todoo.R

class SecondActivity : AppCompatActivity() {

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Retrieve the email passed from MainActivity
        val email = intent.getStringExtra("email")
        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)
        val textViewNumber = findViewById<TextView>(R.id.textViewNumber)
        val buttonClick = findViewById<Button>(R.id.buttonClick)

        // Set the welcome message with the email
        textViewWelcome.text = "welcome back\n$email"
        textViewNumber.text = number.toString()

        // Decrease the number by 2 each time the button is clicked
        buttonClick.setOnClickListener {
            number -= 2
            textViewNumber.text = number.toString()
        }
    }
}
