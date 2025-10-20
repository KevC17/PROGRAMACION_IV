package com.example.basics

fun main() {
    try {
        val totalMascotas = 10 / 0
    } catch (e: Exception) {
        println("Error al calcular la cantidad de mascotas: $e")
    }
}
