package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

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
}