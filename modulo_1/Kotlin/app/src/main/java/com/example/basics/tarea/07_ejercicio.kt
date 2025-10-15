package com.example.basics.tarea

fun main() {
    var totalDia = 0.0
    var clientes = 0
    while (true) {
        print("Nuevo cliente (total) o 'fin': ")
        val entrada = readln()
        if (entrada.lowercase() == "fin") break
        val total = entrada.toDoubleOrNull() ?: continue
        print("Cantidad de ítems: ")
        val items = readln().toIntOrNull() ?: continue
        var totalCliente = total
        if (total > 100) totalCliente *= 0.95
        if (items > 10) println("Caja rápida no disponible")
        println("Total a pagar: $totalCliente")
        totalDia += totalCliente
        clientes++
    }
    println("Total del día: $totalDia")
    println("Clientes atendidos: $clientes")
}
