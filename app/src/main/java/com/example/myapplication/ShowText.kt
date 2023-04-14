package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ShowText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_text)
        var value = intent.extras?.getString("key")
        var textView = findViewById<TextView>(R.id.textView2)
        textView.text = value
    }

    public fun goBack(view: View){
        finish()
    }
}