package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showText(view: View) {
        val intent = Intent(this, ShowText::class.java)
        val bundle = Bundle()

        val textId = R.id.inputText
        val inputText = this.findViewById<TextInputEditText>(textId)

        bundle.putString("key", inputText.text.toString())
        intent.putExtras(bundle)
        startActivity(intent)
    }
}