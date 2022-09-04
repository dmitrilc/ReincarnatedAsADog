package com.example.reincarnatedasadog.ui.state

import android.graphics.drawable.Drawable

data class ResultUiState(
    val breedName: String,
    val ratio: String,
    val image: Drawable? = null
)