package com.example.basics.tarea

fun main() {
    print("Ingrese nombre: ")
    val nombre = readln().lowercase()
    print("Ingrese apellido: ")
    val apellido = readln().lowercase()

    var username = ""
    var i = 0

    while (i < nombre.length || i < apellido.length) {
        if (i < nombre.length) username += nombre[i]
        if (i + 1 < nombre.length) username += nombre[i + 1]
        if (i < apellido.length) username += apellido[i]
        if (i + 1 < apellido.length) username += apellido[i + 1]
        i += 2
    }

    var num = 1
    while (username.length < 6) {
        username += num
        num++
    }

    println("Usuario generado: $username")
}
