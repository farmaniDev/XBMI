package com.farmani.xbmi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resultTv = findViewById<TextView>(R.id.resultTv)
        val bmiResult = intent.getDoubleExtra("result", 0.0)
        resultTv.text = bmiStatus(bmiResult)
    }

    private fun bmiStatus(bmi: Double): String {
        return if (bmi <= 18.5) "Under Weight" else if (bmi <= 24.9) "normal" else if (bmi <= 29.9) "Over weight" else "Obese"
    }
}