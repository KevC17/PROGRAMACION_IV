package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.data.PetRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {
    // Simple profile (can be extended)
    Scaffold(topBar = { TopAppBar(title = { Text("Mi Perfil") }) }) { padding ->
        Column(Modifier.padding(padding).padding(16.dp)) {
            Text("Kevin Condor", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(8.dp))
            Text("Correo: kevin@correo.com")
            Spacer(Modifier.height(16.dp))
            Text("Adopciones realizadas: ${PetRepository.getAdoptions().size}")
        }
    }
}

