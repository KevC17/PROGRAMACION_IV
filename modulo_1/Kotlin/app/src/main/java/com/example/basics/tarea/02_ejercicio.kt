package com.example.basics.tarea

fun main() {
    print("Introduce la distancia en km: ")
    val distancia = readln().toDoubleOrNull() ?: 0.0

    print("¿Está lloviendo? (sí/no): ")
    val llueve = readln().lowercase()

    val costoBase = when {
        distancia <= 5 -> 2.5
        distancia <= 15 -> 5.0
        else -> 8.0
    }

    val costoTotal = if (llueve == "sí") costoBase + 1.5 else costoBase

    println("Costo total: $costoTotal")
}
