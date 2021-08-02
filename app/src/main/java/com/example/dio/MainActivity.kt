package com.example.dio

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = button
        val resultado = resultado

        btnCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2

            val faltas = Integer.parseInt(faltas.text.toString())

            if (media>5 && faltas<11){
                resultado.setText("Aluno Aprovado \n Nota Final: ${media} \n Faltas: ${faltas}")
                resultado.setBackgroundColor(2)
            }else{
                resultado.setText("Aluno Reprovado \n Nota Final: ${media} \n Faltas: ${faltas}")
                resultado.setBackgroundColor(100)
                setContentView(R.layout.main)

            }
        }
    }
}