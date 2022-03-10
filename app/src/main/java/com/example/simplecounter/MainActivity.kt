package com.example.simplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCount = findViewById<Button>(R.id.btn_count)
        val tvCount = findViewById<TextView>(R.id.tv_count)

        var counter = 0
        btnCount.setOnClickListener {
            counter++
            tvCount.text = counter.toString()
        }
    }
}