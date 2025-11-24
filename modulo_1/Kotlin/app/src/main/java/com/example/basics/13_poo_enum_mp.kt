package com.example.basics

enum class TipoComida(val sabor: String, val nutricion: Int) {
    POLLO("pollo", 85) {
        override fun descripcion() = "Comida rica en proteínas para perros activos"
    },
    PESCADO("pescado", 90) {
        override fun descripcion() = "Ideal para gatos con piel sensible"
    },
    CARNE("carne", 95) {
        override fun descripcion() = "Alimento energético para mascotas grandes"
    },
    VEGETALES("vegetales", 80) {
        override fun descripcion() = "Opción ligera y saludable para todas las edades"
    };

    abstract fun descripcion(): String

    companion object {
        fun porSabor(sabor: String) = entries.find { it.sabor == sabor }
    }
}

class ComidaMascota(val tipo: TipoComida, val mascota: String) {
    fun servir() = "Se sirve comida de ${tipo.sabor} a $mascota"
    fun info() = "${tipo.descripcion()} - nivel de nutrición ${tipo.nutricion}"
}

fun main() {
    val comidaLuna = ComidaMascota(TipoComida.PESCADO, "Luna")
    println(comidaLuna)
    println(comidaLuna.servir())
    println(comidaLuna.info())

    val comidaMax = ComidaMascota(TipoComida.CARNE, "Max")
    println(comidaMax)
    println(comidaMax.servir())
    println(comidaMax.info())
}
