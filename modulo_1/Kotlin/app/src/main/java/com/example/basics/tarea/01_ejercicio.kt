package com.example.basics.tarea

fun main() {
    print("Introduce la temperatura actual (°C): ")
    val temp = readln().toDoubleOrNull()
    if (temp == null) {
        println("Temperatura no válida.")
        return
    }

    print("Introduce tu preferencia (frío, templado o caliente): ")
    val preferencia = readln().lowercase()

    when {
        temp > 22 && preferencia == "frio" -> println("Encender aire")
        temp < 18 && preferencia == "caliente" -> println("Encender calefacción")
        temp in 18.0..22.0 && preferencia == "templado" -> println("En confort")
        else -> println("Ventilar")
    }
}
