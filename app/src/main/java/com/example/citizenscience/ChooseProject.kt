package com.example.citizenscience

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChooseProject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_project)
        val textView: TextView = findViewById(R.id.heading)

        // Set the bold typeface
        textView.setTypeface(null, Typeface.BOLD)
    }
}