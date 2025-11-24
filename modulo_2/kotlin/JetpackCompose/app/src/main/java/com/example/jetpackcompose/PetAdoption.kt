package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import com.example.jetpackcompose.data.PetRepository
import com.example.jetpackcompose.nav.AppNav
import com.example.jetpackcompose.ui.theme.PetAdoptionTheme

class PetAdoption : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // use system theme by default
            PetAdoptionTheme {
                AppNav()
            }
        }
    }
}
