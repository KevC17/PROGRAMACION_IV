package com.example.basics

fun main(){
    println("VARIABLES")
    val fundación = "Patitas"
    var perro = "Firu"

    perro = "Firulais"

    println("Tipos de variables")
    println("Tipos de numéricos")
    println("Tipo Entero")
    val edadPeroo: Int = 2
    println(edadPeroo)

    println("Tipo Double")
    val pesoPerro: Double = 20.5
    println(pesoPerro)


    println("Tipo  Texto")
    val nombreAportador: String = "Luis"
    println(nombreAportador)

    println("Tipo  Char")
    //val inicial: Char = "0"
    //println(inicial)

    println("Tipo  Lógico")
    val esHembra: Boolean = true
    println(esHembra)

    println("Nulidad")
    val raza: String? = null
    println(raza)

    println("Nulidad")
    val colorOjos: String? = ""
    println(colorOjos?.length)

    println("Operación de aserción no null")
    val longitudSegura = raza!!.length

    println("Interpolación de strings")
    val nombreHamster: String = "Fiji"
    val edadHamster: Int = 4
    val razaHamster: String = "Blanco"

    println("${nombreHamster.uppercase()} es de raza ${razaHamster}")
    println("En 10 días tendra : ${edadHamster+1} meses")

    println("String Multilinea")
    val mensaje: String = """
        Querido $nombreAportador
        Tu proceso de adopción de $nombreHamster
        ha sido completada!
    """
    println(mensaje)

    println("Conversiones")
    val textoCantidadAnimales: String = "25"
    val cantidadConvertida: Int = textoCantidadAnimales.toInt()
    println("${cantidadConvertida}")

    val numero: Double = 50.8
    val numeroConvertido: String = numero.toString()
    println(numeroConvertido)
}