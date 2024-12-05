package com.teamtalento.pruebafinalm6cris_vigorena

import android.graphics.Color.parseColor
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        //val backgroundColor = ContextCompat.getColor(this, R.color.backgroundColor)
       //mainLayout.setBackgroundColor(backgroundColor)

        val backgroundColorX = parseColor(BuildConfig.BACKGROUND_COLOR_X)

        mainLayout.setBackgroundColor(backgroundColorX)

    }
}
