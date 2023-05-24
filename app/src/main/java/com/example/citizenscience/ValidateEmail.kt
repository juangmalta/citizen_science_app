package com.example.citizenscience
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ValidateEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.validate_email)
        val textView: TextView = findViewById(R.id.heading)
        val textViewDos: TextView = findViewById(R.id.minitexto)

        // Set the bold typeface
        textView.setTypeface(null, Typeface.BOLD)
        textViewDos.setTypeface(null,Typeface.BOLD)
    }

}