package com.example.ejercicios_practica2

fun main() {
    print("Introduce un texto: ")
    var texto = readLine() ?: ""

    texto = texto.lowercase()
    val letras = mutableMapOf<Char, Int>()

    for (letra in texto) {
        if (letra != ' ') {
            val conteoActual = letras[letra] ?: 0
            letras[letra] = conteoActual + 1
        }
    }

    val resultado = letras.toList().sortedByDescending { it.second }

    println("\nFrecuencia de letras (orden descendente):")
    for ((letra, cantidad) in resultado) {
        println("Letra '$letra': $cantidad veces")
    }
}