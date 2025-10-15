package com.example.basics.tarea

fun main() {
    print("Ingrese saldo inicial: ")
    var saldo = readln().toDoubleOrNull() ?: 0.0

    while (true) {
        println("\n1) Depositar\n2) Retirar\n3) Salir")
        print("Elija una opción: ")
        when (readln()) {
            "1" -> {
                print("Monto a depositar: ")
                val monto = readln().toDoubleOrNull() ?: 0.0
                saldo += monto
                println("Saldo actual: $saldo")
            }
            "2" -> {
                print("Monto a retirar: ")
                val monto = readln().toDoubleOrNull() ?: 0.0
                if (monto > saldo) println("Fondos insuficientes")
                else {
                    saldo -= monto
                    println("Saldo actual: $saldo")
                }
            }
            "3" -> {
                println("Sesión terminada")
                break
            }
            else -> println("Opción inválida")
        }
    }
}
