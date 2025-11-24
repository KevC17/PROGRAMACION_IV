package com.example.basics.practica

fun main(){
    print("Ingrese la edad: ")
    val edad = readln().toInt()?:0
    var precio = 5
    when{
        edad < 12 -> precio -= 2
        edad >= 65 -> precio -= 1
    }
    println("Su boleto tiene un precio de $precio")
}