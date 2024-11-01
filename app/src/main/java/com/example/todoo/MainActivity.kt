// MainActivity.kt
package com.example.midtermBtueasy

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.todoo.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val textViewEmail = findViewById<TextView>(R.id.textViewWelcome)
        val buttonOkay = findViewById<Button>(R.id.buttonOkay)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonOkay.setOnClickListener {
            val email = editTextEmail.text.toString()
            textViewEmail.text = "welcome back\n$email"
        }

        buttonNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("email", editTextEmail.text.toString())
            startActivity(intent)
        }
    }
}
