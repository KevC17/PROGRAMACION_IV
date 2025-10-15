package com.example.basics.tarea

fun main() {
    print("Ingresa tu meta de ahorro: ")
    val meta = readln().toDoubleOrNull() ?: 0.0
    print("Ingresa tu ahorro inicial: ")
    var ahorro = readln().toDoubleOrNull() ?: 0.0
    var depositoSemanal = 5.0
    var semana = 1
    while (ahorro < meta) {
        ahorro += depositoSemanal
        println("Semana $semana: depositas $$depositoSemanal | Total acumulado: $$ahorro")
        depositoSemanal += 10
        semana++
    }
    println("Meta alcanzada en ${semana - 1} semanas. Total: $$ahorro")
}
