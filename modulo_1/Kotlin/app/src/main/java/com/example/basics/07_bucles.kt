package com.example.basics

fun main(){
    println("Bucles")
    val jedis = listOf("Luke", "Leia", "Obi-Wan", "Yoda", "Ahsoka")
    for((index,jedi) in jedis.withIndex()){
        println("${index+1}.$jedi")
    }

    for(i in 0..20 step 5){
        println("Energía: $i%")
    }

    for(countdown in 10 downTo 1){
        println("Energía: $countdown")
    }

    for (jedi in jedis){
        if (jedi == "Obi-Wan") continue
        if (jedi == "Yoda") break
        println("entrenando a $jedi")
    }
}