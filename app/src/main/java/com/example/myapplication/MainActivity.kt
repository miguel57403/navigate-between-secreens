package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonId = R.id.button
        var botao = this.findViewById<Button>(buttonId)

        var textId = R.id.textView
        var caixa = this.findViewById<TextView>(textId)

        var valor = 0

        botao.setOnClickListener{
            valor ++
            caixa.text = valor.toString()
        }
    }

    fun listUsers(view: View) {
        val intent = Intent(this, ListUsers::class.java)
        val bundle = Bundle()
        bundle.putString("hello", "world")

        intent.putExtras(bundle)
        startActivity(intent)
    }
}