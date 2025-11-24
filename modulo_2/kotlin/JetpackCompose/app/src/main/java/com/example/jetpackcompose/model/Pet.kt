package com.example.jetpackcompose.model
import androidx.annotation.DrawableRes

data class Pet(
    val id: Int,
    val name: String,
    val type: String,
    val age: Int,
    @DrawableRes val imageRes: Int,
    val description: String,
    val adopted: Boolean = false,
    val adoptedBy: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val isFavorite: Boolean = false
)
