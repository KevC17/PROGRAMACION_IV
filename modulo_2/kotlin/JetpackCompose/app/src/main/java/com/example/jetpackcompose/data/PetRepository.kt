package com.example.jetpackcompose.data

import com.example.jetpackcompose.model.Pet
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

object PetRepository {
    // Backing state
    private val _pets = MutableStateFlow(samplePets)
    val pets: StateFlow<List<Pet>> = _pets

    fun toggleFavorite(id: Int) {
        _pets.value = _pets.value.map {
            if (it.id == id) it.copy(isFavorite = !it.isFavorite) else it
        }
    }

    fun adoptPet(id: Int, user: String) {
        _pets.value = _pets.value.map {
            if (it.id == id) it.copy(adopted = true, adoptedBy = user) else it
        }
    }

    fun getPetById(id: Int): Pet? = _pets.value.find { it.id == id }

    fun getFavorites(): List<Pet> = _pets.value.filter { it.isFavorite }

    fun getAdoptions(): List<Pet> = _pets.value.filter { it.adopted }
}
