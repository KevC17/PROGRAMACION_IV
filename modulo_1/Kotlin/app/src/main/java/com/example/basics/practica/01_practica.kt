package com.example.basics.practica

fun main(){
    print("Ingrese el color del semaforo (rojo,amarrillo,verde): ")
    val color = readln()?:""
    println("Ignrese si presionó el boton (si/no):")
    val boton = readln()?:""

    when{
        color == "verde" && boton == "si" -> println("Espera a rojo")
        color == "rojo" -> println("Cruza")
        color == "amarrillo" -> println("Prepárate")
        else -> println("Espera")
    }
}