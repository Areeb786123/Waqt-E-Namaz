package com.example.waqt_e_namaz

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import com.google.android.material.progressindicator.LinearProgressIndicator

class Splah_screen : AppCompatActivity() {

    lateinit var progressBar: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah_screen)

        progressBar = findViewById(R.id.progress_bar);


        progressBar.visibility = View.VISIBLE

        val handler = Handler().postDelayed({
            val splash_intent = Intent(this, MainActivity::class.java)
            startActivity(splash_intent)

            progressBar.visibility = View.GONE

        }, 2000)


    }
}