package com.example.basics

fun main() {
    println("Gestor de Adopción de Mascotas")

    println("Número actual de mascotas en el refugio:")
    val mascotas = readln()?.toIntOrNull() ?: 0

    println("Ingrese el número de mascotas a agregar, adoptar o distribuir:")
    val cantidad = readln()?.toIntOrNull() ?: 0

    println("Ingrese la operación:")
    println("+ para registrar nuevas mascotas")
    println("- para registrar adopciones")
    println("* para calcular total en varios refugios")
    println("/ para distribuir entre cuidadores")

    val operacion = readln()

    when (operacion) {
        "+" -> println("Total de mascotas ahora: ${mascotas + cantidad}")
        "-" -> println("Mascotas restantes después de adopciones: ${mascotas - cantidad}")
        "*" -> println("Total de mascotas en varios refugios: ${mascotas * cantidad}")
        "/" -> println("Mascotas por cuidador: ${mascotas / cantidad}")
        else -> println("Operación no válida")
    }
}
