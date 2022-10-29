package com.example.happybirthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val nm=intent.getStringExtra("name")
        val txt=findViewById<TextView>(R.id.textView3)
        txt.text="Happy Birthday!!\n$nm"
    }
}