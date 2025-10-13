package com.example.basics

fun main() {
    println("Refugio de Mascotas")

    val nivelCariño = mapOf(
        "Luna" to 90,
        "Max" to 85,
        "Coco" to 95,
        "Nala" to 100
    )

    println("Nivel de cariño de las mascotas: $nivelCariño")

    println("Mascotas adoptadas")

    val mascotasAdoptadas = mutableMapOf<String, Int>()
    mascotasAdoptadas["Luna"] = 2
    mascotasAdoptadas["Max"] = 1
    mascotasAdoptadas.put("Coco", 3)

    println("Cantidad de adopciones: $mascotasAdoptadas")

    for ((mascota, nivel) in nivelCariño) {
        println("$mascota tiene un nivel de cariño de $nivel")
    }

    val mascotasPequeñas = setOf("Luna", "Nala", "Milo")
    println("Mascotas pequeñas: $mascotasPequeñas")

    val mascotasJuguetonas = setOf("Coco", "Nala", "Rocky")
    println("Mascotas juguetonas: $mascotasJuguetonas")

    println("Operaciones de conjuntos")
    val interseccion = mascotasPequeñas intersect mascotasJuguetonas
    println("Intersección: $interseccion")

    val union = mascotasPequeñas union mascotasJuguetonas
    println("Unión: $union")

    val diferencia = mascotasPequeñas - mascotasJuguetonas
    println("Diferencia: $diferencia")
}