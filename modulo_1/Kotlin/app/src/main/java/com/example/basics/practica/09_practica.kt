package com.example.basics.practica

fun main(){
    println("Tabla de multiplicar")
    println("Ingrese el valor")
    var valor: Int = readln()?.toIntOrNull()?:0

    for(i in 1..10 step 1){
        println("${valor} x $i = ${i*valor}")
    }
}