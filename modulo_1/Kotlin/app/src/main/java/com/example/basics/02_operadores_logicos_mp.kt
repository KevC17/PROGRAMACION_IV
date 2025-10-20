package com.example.basics

fun main(){
    println("Operadores Logicos")
    val edad: Int = 5
    val vacunado: Boolean = true

    val esAdoptable = edad >= 5 && vacunado
    val necesitaCrecer =! vacunado

    println("Es adoptable: ${esAdoptable}")
    println("Necesita crecer más: ${necesitaCrecer}")
}