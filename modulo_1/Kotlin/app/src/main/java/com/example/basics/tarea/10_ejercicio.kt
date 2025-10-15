package com.example.basics.tarea

fun main() {
    print("Número de etapas: ")
    val etapas = readln().toIntOrNull() ?: 0
    var energia = 100

    for (etapa in 1..etapas) {
        print("Terreno de la etapa $etapa (1=asfalto, 2=tierra, 3=barro): ")
        val terreno = readln().toIntOrNull() ?: 1
        energia -= when (terreno) {
            1 -> 5
            2 -> 10
            else -> 15
        }
        if (energia <= 0) {
            println("Abandona en etapa $etapa")
            return
        }
    }

    println("Rally completado con energía $energia")
}
