package com.example.basics

class EdadInsuficienteException(message: String) : Exception(message)
class MascotaAgresivaException(message: String) : Exception(message)

fun procesarAdopcion(edadMascota: Int, nivelAgresividad: Int): String {
    return try {
        when {
            edadMascota < 2 -> throw EdadInsuficienteException("La mascota es demasiado joven para adopción: $edadMascota años")
            nivelAgresividad > 80 -> throw MascotaAgresivaException("La mascota muestra un alto nivel de agresividad")
            else -> "Adopción aprobada: la mascota cumple con los requisitos"
        }
    } catch (e: EdadInsuficienteException) {
        "Error: ${e.message}. Espere un tiempo antes de volver a intentar la adopción."
    } catch (e: MascotaAgresivaException) {
        "Error: ${e.message}. Se recomienda entrenamiento adicional."
    } catch (e: Exception) {
        "Error inesperado: ${e.message}"
    } finally {
        println("Reporte de adopción procesado.")
    }
}

fun main() {
    println(procesarAdopcion(1, 40))
    println(procesarAdopcion(3, 90))
    println(procesarAdopcion(4, 40))
}
