package com.example.reincarnatedasadog.ui.state

import com.example.reincarnatedasadog.data.entity.Breed

data class ResultUiState(
    val breed: Breed,
    val ratio: String,
    val displayName: String,
    val imageUri: String? = null,
    val imageUriCallback: (Breed)->Unit
)