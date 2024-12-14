package com.ahinsa.workout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.ahinsa.workout.exercises.Exercise01
import com.ahinsa.workout.exercises.Exercise02
import com.ahinsa.workout.exercises.Exercise03
import com.ahinsa.workout.exercises.Exercise04
import com.ahinsa.workout.exercises.Exercise05
import com.ahinsa.workout.exercises.Exercise06
import com.ahinsa.workout.exercises.Exercise07
import com.ahinsa.workout.exercises.Exercise08
import com.ahinsa.workout.exercises.Exercise09
import com.ahinsa.workout.exercises.Exercise10

class SelectWorkoutActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_workout)

        val exercise01 = findViewById<CardView>(R.id.exercise_01)
        exercise01.setOnClickListener {
            val intent = Intent(this, Exercise01::class.java)
            startActivity(intent)
        }

        val exercise02 = findViewById<CardView>(R.id.exercise_02)
        exercise02.setOnClickListener {
            val intent = Intent(this, Exercise02::class.java)
            startActivity(intent)
        }

        val exercise03 = findViewById<CardView>(R.id.exercise_03)
        exercise03.setOnClickListener {
            val intent = Intent(this, Exercise03::class.java)
            startActivity(intent)
        }

        val exercise04 = findViewById<CardView>(R.id.exercise_04)
        exercise04.setOnClickListener {
            val intent = Intent(this, Exercise04::class.java)
            startActivity(intent)
        }

        val exercise05 = findViewById<CardView>(R.id.exercise_05)
        exercise05.setOnClickListener {
            val intent = Intent(this, Exercise05::class.java)
            startActivity(intent)
        }

        val exercise06 = findViewById<CardView>(R.id.exercise_06)
        exercise06.setOnClickListener {
            val intent = Intent(this, Exercise06::class.java)
            startActivity(intent)
        }

        val exercise07 = findViewById<CardView>(R.id.exercise_07)
        exercise07.setOnClickListener {
            val intent = Intent(this, Exercise07::class.java)
            startActivity(intent)
        }

        val exercise08 = findViewById<CardView>(R.id.exercise_08)
        exercise08.setOnClickListener {
            val intent = Intent(this, Exercise08::class.java)
            startActivity(intent)
        }

        val exercise09 = findViewById<CardView>(R.id.exercise_09)
        exercise09.setOnClickListener {
            val intent = Intent(this, Exercise09::class.java)
            startActivity(intent)
        }

        val exercise10 = findViewById<CardView>(R.id.exercise_10)
        exercise10.setOnClickListener {
            val intent = Intent(this, Exercise10::class.java)
            startActivity(intent)
        }
    }
}