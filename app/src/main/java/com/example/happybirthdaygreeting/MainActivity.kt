package com.example.happybirthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createBirthdayCard(view: View) {
        val editText=findViewById<EditText>(R.id.editTextTextPersonName)
        val nm=editText.text.toString()
        val intent= Intent(this,MainActivity2::class.java)
        intent.putExtra("name",nm)
        startActivity(intent)
    }
}