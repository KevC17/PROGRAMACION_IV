package com.example.basics.tarea

fun main() {
    print("Ingresa un texto: ")
    val texto = readln()
    val vocales = "aeiou"
    var contador = 0
    for (i in 0..texto.length - 2) {
        if (texto[i].lowercaseChar() in vocales && texto[i + 1].lowercaseChar() in vocales) contador++
    }
    println("Total de vocales consecutivas: $contador")
}
