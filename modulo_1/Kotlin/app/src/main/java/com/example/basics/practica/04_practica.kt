package com.example.basics.practica

fun main() {
    print("Ingrese el numero hasta el que contar los multiplos de 3: ")
    val valor = readln().toIntOrNull()?:0
    var resultado = 0
    for(i in 1 .. valor){
        if (i%3 == 0){
            resultado += i
        }
    }
    println("El total de los multiplos de 3 es $resultado")
}