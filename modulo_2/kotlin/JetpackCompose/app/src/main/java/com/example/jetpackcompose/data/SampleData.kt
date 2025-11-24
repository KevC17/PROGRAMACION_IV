package com.example.jetpackcompose.data

import com.example.jetpackcompose.R
import com.example.jetpackcompose.model.Pet

val samplePets = listOf(
    Pet(
        id = 1,
        name = "Bruno",
        type = "Perro",
        age = 2,
        imageRes = R.drawable.dog1,
        description = "Cariñoso y juguetón, ideal para familias."
    ),
    Pet(
        id = 2,
        name = "Luna",
        type = "Perro",
        age = 1,
        imageRes = R.drawable.dog2,
        description = "Muy dulce, le encantan las siestas."
    ),
    Pet(
        id = 3,
        name = "Michi",
        type = "Gato",
        age = 3,
        imageRes = R.drawable.cat1,
        description = "Tranquilo y limpio, perfecto para departamentos."
    )
)
