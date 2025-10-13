package com.example.basics

fun main() {
    println("Bucles - Adopción de Mascotas")

    val mascotas = listOf("Firulais", "Michi", "Bunny", "Rex", "Luna")
    for ((index, mascota) in mascotas.withIndex()) {
        println("${index + 1}. $mascota")
    }

    for (i in 0..20 step 5) {
        println("Nivel de comida: $i%")
    }

    for (countdown in 10 downTo 1) {
        println("Tiempo para la próxima adopción: $countdown")
    }

    for (mascota in mascotas) {
        if (mascota == "Rex") continue
        if (mascota == "Luna") break
        println("Preparando a $mascota para adopción")
    }
}
