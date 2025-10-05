package com.example.basics

fun main() {
    println("Estructuras de control - Adopción de Mascotas")
    println("Condicionales")

    val perros = 8
    val gatos = 12
    if (perros > gatos) {
        println("Hay más perros que gatos")
    } else {
        println("Hay más gatos que perros")
    }

    println("Nivel de salud de la mascota")
    var salud: Int = 7
    if (salud > 8) {
        println("Excelente estado de salud")
    } else if (salud > 5) {
        println("Buen estado de salud")
    } else {
        println("Requiere atención veterinaria")
    }

    var tipoMascota: String = "Perro"
    when (tipoMascota) {
        "Perro", "Perrito" -> println("Es un amigo fiel")
        "Gato", "Gatito" -> println("Es un compañero tranquilo")
        "Conejo", "Hámster" -> println("Es una mascota pequeña")
        else -> println("Tipo de mascota no registrado")
    }

    var edad: Int = 3
    var energia: Int = 8
    when {
        edad < 2 && energia > 7 -> println("Cachorro muy activo")
        edad in 2..7 -> println("Mascota adulta")
        else -> println("Mascota senior")
    }
}
