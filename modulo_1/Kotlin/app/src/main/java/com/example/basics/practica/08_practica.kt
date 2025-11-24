package com.example.basics.practica

fun main() {
    println("Ingrese la palabra:")
    var palabra: String = readln()?:""
    var contador = 0
    val vocales = listOf("a","e","i","o","u")
    for (letra in palabra){
        if(letra.toLowerCase().toString() in vocales){
            contador ++
        }
    }
    println("El total de vocales de la palabra $palabra son $contador")
}