package com.example.basics

data class Mascota(val nombre: String, val edad: Int, val nivelCariño: Int, val cuidador: String? = null) {
    val categoria: String
        get() = when {
            nivelCariño >= 90 -> "Muy cariñosa"
            nivelCariño >= 70 -> "Afectuosa"
            nivelCariño >= 50 -> "Amigable"
            else -> "Tímida"
        }

    fun puedeSocializar(): Boolean = nivelCariño >= 60

    fun puedeAdoptarse(): Boolean = edad >= 2
}

fun main() {
    val luna = Mascota("Luna", 3, 80, "María López")
    println(luna)

    val (nombre, edad, nivelCariño) = luna
    println("Nombre de la mascota: $nombre, edad: $edad, nivel de cariño: $nivelCariño")

    val coco = luna.copy(nombre = "Coco", nivelCariño = 95)
    println(coco)

    println("Categoría de Coco: ${coco.categoria}")

    println("¿Coco puede socializar?: ${coco.puedeSocializar()}")
}
