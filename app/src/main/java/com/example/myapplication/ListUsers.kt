package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ListUsers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_users)
        var value = intent.extras?.getString("hello")

        var textView = findViewById<TextView>(R.id.textView2)
        textView.text = value
    }
}