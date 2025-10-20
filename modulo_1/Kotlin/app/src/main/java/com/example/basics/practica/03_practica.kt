package com.example.basics.practica

fun main () {
    print("Ingrese el numero hasta el que contar los pares: ")
    val valor = readln().toIntOrNull()?:0
    var contador = 0
    for(i in 1 .. valor){
        if (i%2 == 0){
            contador ++
        }
    }
    println("El total de numeros entre el 1 y el $valor es $contador")
}