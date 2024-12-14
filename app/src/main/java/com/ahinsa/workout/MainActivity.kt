package com.ahinsa.workout

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startNowTextView = findViewById<TextView>(R.id.start_btn)

        startNowTextView.setOnClickListener {
            val intent = Intent(this, SelectWorkoutActivity::class.java)
            startActivity(intent)
        }
    }
}