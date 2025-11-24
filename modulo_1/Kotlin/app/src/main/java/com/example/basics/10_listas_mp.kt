package com.example.basics

fun main() {
    println("Gestión de Mascotas")

    val mascotasDisponibles: List<String> = listOf("Luna", "Max", "Nala")
    println("Mascotas disponibles: $mascotasDisponibles")

    val mascotasAdoptadas: MutableList<String> = mutableListOf("Coco", "Rocky", "Milo")
    println("Mascotas adoptadas: $mascotasAdoptadas")

    mascotasAdoptadas.add("Bella")
    println("Mascotas adoptadas: $mascotasAdoptadas")

    mascotasAdoptadas.removeAt(0)
    println("Mascotas adoptadas: $mascotasAdoptadas")

    for (mascota in mascotasAdoptadas) println(mascota)

    val razas = mutableListOf("Labrador", "Poodle")
    razas.add("Bulldog")
    razas += "Beagle"
    razas.add(1, "Husky")
    println(razas)
    razas.remove("Poodle")
    println(razas)
    razas.removeAt(0)
    println(razas)
    razas[0] = "Golden Retriever"
    println(razas)
    razas.clear()
    println(razas)
    println(razas.isEmpty())

    println("Búsquedas de Mascotas")
    val nombres = mutableListOf("Luna", "Max", "Coco")
    println(nombres.find { it.startsWith("M") })
    println(nombres.firstOrNull { it.length > 3 })
    println(nombres.any { it.contains('o') })
    println(nombres.none { it == "Rex" })

    println("Ordenamiento de Mascotas")
    val edadesMascotas = mutableListOf(3, 1, 5, 2, 4, 2, 6, 1)
    println(edadesMascotas.sorted())
    println(edadesMascotas.sortedDescending())
    println(edadesMascotas.distinct())
}