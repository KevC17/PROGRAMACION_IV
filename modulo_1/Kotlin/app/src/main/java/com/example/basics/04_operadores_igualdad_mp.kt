package com.example.basics

fun main() {
    println("Operadores Igualdad - Adopción de Mascotas")
    val mascota1: String = "Firulais"
    val mascota2: String = "Firulais"
    val mascota3: String = String("Firulais".toCharArray())

    println("Igualdad estructural (contenido)")
    println(mascota1 == mascota2)
    println(mascota1 == mascota3)

    println("Igualdad referencial (misma instancia)")
    println(mascota1 === mascota2)
    println(mascota1 === mascota3)
}
