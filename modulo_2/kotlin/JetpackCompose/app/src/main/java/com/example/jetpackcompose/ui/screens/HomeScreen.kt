package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.data.PetRepository
import com.example.jetpackcompose.model.Pet
import com.example.jetpackcompose.nav.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val pets by PetRepository.pets.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mascotas en adopción") },
                actions = {
                    IconButton(onClick = { navController.navigate(Screen.Adoptions.route) }) {
                        Icon(Icons.Default.Favorite, contentDescription = "Adoptions")
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            items(pets) { pet ->
                PetListItem(pet = pet, onClick = { navController.navigate(Screen.Detail.createRoute(pet.id)) })
            }
        }
    }
}

@Composable
fun PetListItem(pet: Pet, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = pet.imageRes),
                contentDescription = pet.name,
                modifier = Modifier.size(88.dp)
            )
            Spacer(Modifier.width(16.dp))
            Column(Modifier.weight(1f)) {
                Text(pet.name, style = MaterialTheme.typography.titleLarge)
                Text("${pet.age} años • ${pet.type}", style = MaterialTheme.typography.bodyMedium)
            }
            IconButton(onClick = { PetRepository.toggleFavorite(pet.id) }) {
                Icon(
                    imageVector = if (pet.isFavorite) Icons.Filled.Favorite else Icons.Default.Favorite,
                    contentDescription = "Me gusta",
                    tint = if (pet.isFavorite) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}
