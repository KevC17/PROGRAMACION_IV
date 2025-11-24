package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.data.PetRepository
import com.example.jetpackcompose.model.Pet

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PetDetailScreen(navController: NavController, petId: Int) {
    val pet = PetRepository.getPetById(petId) ?: return

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(pet.name) })
        }
    ) { padding ->
        Column(modifier = Modifier
            .padding(padding)
            .padding(16.dp)) {

            Image(
                painter = painterResource(id = pet.imageRes),
                contentDescription = pet.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
            )

            Spacer(Modifier.height(12.dp))

            Text(pet.name, style = MaterialTheme.typography.headlineMedium)
            Text("${pet.age} años • ${pet.type}", style = MaterialTheme.typography.bodyMedium)
            Spacer(Modifier.height(8.dp))
            Text(pet.description, style = MaterialTheme.typography.bodyLarge)

            Spacer(Modifier.height(20.dp))

            Row {
                Button(onClick = { PetRepository.toggleFavorite(pet.id) }) {
                    Icon(
                        imageVector = if (pet.isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                        contentDescription = "Favorite"
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(if (pet.isFavorite) "Quitar favorito" else "Me gusta")
                }

                Spacer(Modifier.width(12.dp))

                Button(onClick = { PetRepository.adoptPet(pet.id, "Usuario Ejemplo") }) {
                    Text("Adoptar")
                }
            }
        }
    }
}
