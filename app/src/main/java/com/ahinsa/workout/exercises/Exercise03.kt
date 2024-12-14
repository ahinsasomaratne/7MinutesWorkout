package com.ahinsa.workout.exercises

import android.app.AlertDialog
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.ahinsa.workout.R

class Exercise03 : AppCompatActivity() {

    private lateinit var startButton: CardView
    private lateinit var progressBar: ProgressBar
    private var mediaPlayer: MediaPlayer? = null
    private lateinit var timer: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise03)

        startButton = findViewById(R.id.start_btn)
        progressBar = findViewById(R.id.show_progress)

        startButton.setOnClickListener {
            startExercise()
        }
    }

    private fun startExercise() {
        startButton.isClickable = false

        progressBar.visibility = View.VISIBLE
        progressBar.progress = 0
        progressBar.max = 60

        mediaPlayer = MediaPlayer.create(this, R.raw.exercise).apply {
            isLooping = true
            start()
        }

        timer = object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val progress = ((60000 - millisUntilFinished) / 1000).toInt()
                progressBar.progress = progress
            }

            override fun onFinish() {
                progressBar.visibility = View.GONE
                mediaPlayer?.stop()
                mediaPlayer?.release()
                mediaPlayer = null

                startButton.isClickable = true

                showCompletionDialog()
            }
        }.start()
    }

    private fun showCompletionDialog() {
        AlertDialog.Builder(this)
            .setTitle("Congratulations!")
            .setMessage("You have completed the exercise!")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
        if (::timer.isInitialized) {
            timer.cancel()
        }
    }
}