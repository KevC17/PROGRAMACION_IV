package com.example.basics

fun main() {
    println("Operadores Aritmeticos")
    println("Suma")
    var perros: Int = 8
    var gatos: Int = 5
    var total_mascotas: Int = perros + gatos
    print("Total de mascotas en adopción: $total_mascotas")

    println("Resta")
    val mascotasIniciales: Int = 20
    val mascotasAdoptadas: Int = 7
    val mascotasRestantes: Int = mascotasIniciales - mascotasAdoptadas

    println("Mascotas que aún esperan adopción: $mascotasRestantes")

    println("Multiplicación")
    val familias = 4
    val mascotasPorFamilia = 2
    val totalAdoptadas = familias * mascotasPorFamilia

    println("Total de mascotas adoptadas: $totalAdoptadas")

    println("División")
    val kilosComida = 50.0
    val mascotas = 10
    val comidaPorMascota = kilosComida / mascotas

    println("Cada mascota recibe $comidaPorMascota kg de comida")
}