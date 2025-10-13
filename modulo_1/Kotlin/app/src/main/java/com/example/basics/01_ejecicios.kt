package com.example.basics

fun calculadora(operacion: String, numero1: Int, numero2: Int): Int{
    var resultado = 0
    when(operacion){
        "+" -> resultado = numero1+numero2
        "-" -> resultado = numero1-numero2
        "*" -> resultado = numero1*numero2
        "/" -> resultado = numero1/numero2
    }
    return resultado
}

fun main(){
    /*
    println("Ingrese su promedio:")
    var promedio: Double = readln()?.toDoubleOrNull()?:0.0
    println("Ingrese 's' si trabaja o 'n' si no trabaja")
    var isWork: String = readln()
    when{
        promedio >= 90 && isWork == "n" -> println("Beca Completa")
        promedio >= 90 && isWork == "s" -> println("Beca parcial")
        promedio < 90 -> println("Sin Beca")
    }

    print("Ingrese una hora 0-23: ")
    var hora: Int = readln()?.toIntOrNull()?:0
    when{
        hora >= 7 && hora <= 13 -> println("Clases en la mañana")
        hora >= 14 && hora <= 19 -> println("Clases de la tarde")
        else -> println("Horario lectivo")
    }
    */

    println("Calculadora")
    println("Primer valor")
    var valor1: Int = readln().toIntOrNull()?:0
    println("Segundo valor")
    var valor2: Int = readln().toIntOrNull()?:0
    println("Operación")
    var operacion: String = readln()
    calculadora(operacion,valor2, valor1)
}