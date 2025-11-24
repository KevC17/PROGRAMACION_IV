package com.example.basics.tarea

fun main() {
    print("Introduce la distancia en km: ")
    val distancia = readLine()?.toDoubleOrNull()?:0.0

    print("¿Está lloviendo? (sí/no): ")
    val llueve = readLine()?.lowercase()

    var costoBase = 0.0

    when {
        distancia <= 5 -> costoBase = 2.5
        distancia <= 15 -> costoBase = 5.0
        distancia > 15 -> costoBase = 8.0
        else -> costoBase = 0.0
    }

    if (llueve == "sí") {
        costoBase += 1.5
    }

    println("Costo total: $costoBase")
}
