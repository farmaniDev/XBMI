package com.farmani.xbmi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightET = findViewById<EditText>(R.id.heightEditText)
        val weightET = findViewById<EditText>(R.id.weightEditText)
        val calculate = findViewById<Button>(R.id.calculateBtn)

        calculate.setOnClickListener {
            val height = heightET.text.toString().toDouble()
            val weight = weightET.text.toString().toDouble()
            val result = (weight / (height * height))
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result", result)
            startActivity(intent)
        }
    }
}