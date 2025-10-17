package com.example.basics.practica

fun main(){
    print("Ingrese la temperatura: ")
    var temperatura = readln().toIntOrNull()?:0
    when{
        temperatura <= 0 -> println("Solido")
        temperatura in 1 .. 99 -> println("Liquido")
        temperatura >= 100 -> println("Gaseoso")
    }
}