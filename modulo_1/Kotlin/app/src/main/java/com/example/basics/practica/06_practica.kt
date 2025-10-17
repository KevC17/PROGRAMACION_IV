package com.example.basics.practica

fun main(){
    do{
        println("Menu de calculadora")
        println("1 Sumar")
        println("2 Restar")
        println("3 Salir")
        println("Ingrese la opcion:")
        var opcion = readln().toIntOrNull()?:0
        when(opcion){
            1 -> {
                println("Ingrese el primer numero:")
                var numero1 = readln().toIntOrNull()?:0

                println("Ingrese el segundo numero:")
                var numero2 = readln().toIntOrNull()?:0

                println("La suma es: ${numero1+numero2}")
            }
            2 -> {
                println("Ingrese el primer numero:")
                var numero1 = readln().toIntOrNull()?:0

                println("Ingrese el segundo numero:")
                var numero2 = readln().toIntOrNull()?:0

                println("La resta es: ${numero1-numero2}")
            }
        }
    }while(opcion != 3)
}