package com.example.basics

fun main(){
    println("Listas")

    val listaInmutable: List<Int> = listOf(1,2,3)
    println("Lista inmutable: $listaInmutable")

    val listaMutable: MutableList<Int> = mutableListOf(4,5,6)
    println("Lista mutable: $listaMutable")

    listaMutable.add(7)
    println("Lista mutable: $listaMutable")

    listaMutable.removeAt(0)
    println("Lista mutable: $listaMutable")

    for(mutable in listaMutable) println(mutable)

    val colores = mutableListOf("rojo", "verde")
    colores.add("azul")
    colores+="amarrillo"
    colores.add(1,"blanco")
    println(colores)
    colores.remove("verde")
    println(colores)
    colores.removeAt(0)
    println(colores)
    colores[0]="negro"
    println(colores)
    colores.clear()
    println(colores)
    println(colores.isEmpty())

    println("Busquedas con Mutable List")
    val nombres = mutableListOf("Juan", "Luis", "Pedro")
    println(nombres.find{it.startsWith("L")})
    println(nombres.firstOrNull{it.length>4})
    println(nombres.any{it.contains('j')})
    println(nombres.none{it == "X"})

    println("Ordenamiento con Mutable List")
    val numerosDesordenados = mutableListOf(8,3,2,4,7,2,7,0,6)
    println(numerosDesordenados.sorted())
    println(numerosDesordenados.sortedDescending())
    println(numerosDesordenados.distinct())

}