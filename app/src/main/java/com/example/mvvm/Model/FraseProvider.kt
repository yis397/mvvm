package com.example.mvvm.Model

class FraseProvider {

    companion object{
        fun getRandom():Int{
            val i:Int=(0..5).random()
            return i;
        }
        private val preguntas= listOf<Frase>(
            Frase("Una frase","Yo"),
            Frase("Dos frase","Yo"),
            Frase("Tres frase","Yo"),
            Frase("Cuatro frase","Yo"),
            Frase(" Quinto frase","Yo"),
            Frase("Sexto frase","Yo"),
        )
    }
}