package com.ludmilla.calculadoradenotasescolares

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ludmilla.calculadoradenotasescolares.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener {
            val num1 = binding.edtNota1
            val num2 = binding.edtNota2
            val num3 = binding.edtNota3
            val num4 = binding.edtNota4
            val faltas = binding.edtNumeroDeFaltas
            val resultado = binding.txtResultado

            val nota1 = Integer.parseInt(num1.text.toString())
            val nota2 = Integer.parseInt(num2.text.toString())
            val nota3 = Integer.parseInt(num3.text.toString())
            val nota4 = Integer.parseInt(num4.text.toString())
            val numerofaltas = Integer.parseInt(faltas.text.toString())

            val media = (nota1+nota2+nota3+nota4)/4

            if (media >=5 && numerofaltas <=20){
                resultado.setText("Aluno foi aprovado \n Média final $media")
                resultado.setTextColor(getColor(R.color.green))

            }else if (numerofaltas > 20){
                resultado.setText("Aluno foi reprovado por faltas \n Média final: $media")
                resultado.setTextColor(getColor(R.color.red))
            }else if (media <5){
                resultado.setText("Alno foi reprovado por nota \n Média final $media")
                resultado.setTextColor(getColor(R.color.red))
            }
        }
    }
}