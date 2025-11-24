package com.example.jetpackcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetpackcompose.data.PetRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdoptionsScreen(navController: NavHostController) {
    val adopted = PetRepository.getAdoptions()

    Scaffold(topBar = { TopAppBar(title = { Text("Mis Adopciones") }) }) { padding ->
        if (adopted.isEmpty()) {
            Box(Modifier.fillMaxSize().padding(padding), contentAlignment = androidx.compose.ui.Alignment.Center) {
                Text("Aún no has adoptado ninguna mascota.")
            }
        } else {
            LazyColumn(Modifier.padding(padding)) {
                items(adopted) { pet ->
                    Row(Modifier.padding(12.dp)) {
                        Image(painter = painterResource(pet.imageRes), contentDescription = pet.name, modifier = Modifier.size(72.dp))
                        Spacer(Modifier.width(12.dp))
                        Column {
                            Text(pet.name, style = MaterialTheme.typography.titleMedium)
                            Text("Adoptado por: ${pet.adoptedBy ?: "—"}")
                        }
                    }
                }
            }
        }
    }
}

