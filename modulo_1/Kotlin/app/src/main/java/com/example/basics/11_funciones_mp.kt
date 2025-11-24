package com.example.basics

fun mostrarMensaje() {
    println("Bienvenido al Refugio de Mascotas")
}

fun contarAdopciones(gatos: Int, perros: Int): Int {
    return gatos + perros
}

fun duplicarEdad(edad: Int) = edad * 2

fun calcularDatos(adoptados: Int, disponibles: Int): Pair<Int, Int> {
    val total = adoptados + disponibles
    val diferencia = adoptados - disponibles
    return Pair(total, diferencia)
}

fun main() {
    mostrarMensaje()
    val totalAdopciones = contarAdopciones(3, 5)
    println(totalAdopciones)
    println(duplicarEdad(4))

    println(calcularDatos(10, 6))

    val edadDoble = { edad: Int -> edad * 2 }
    val saludoMascota = { nombre: String -> "Gracias por adoptar a $nombre" }
    println(edadDoble(3))
    println(saludoMascota("Luna"))
}