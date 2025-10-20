package com.example.basics.tarea

fun main() {
    print("Introduce la hora (0–23): ")
    val hora = readLine()?.toIntOrNull() ?: 0

    print("Introduce el rol (admin, invitado, empleado): ")
    val rol = readLine()?.lowercase()

    val accesoPermitido = when (rol) {
        "admin" -> true
        "invitado" -> hora in 9..17
        "empleado" -> hora in 6..20
        else -> false
    }

    if (accesoPermitido) {
        println("Acceso Permitido")
    } else {
        println("Acceso Denegado")
    }
}