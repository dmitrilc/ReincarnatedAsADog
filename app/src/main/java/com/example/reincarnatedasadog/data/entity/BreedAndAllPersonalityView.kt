package com.example.reincarnatedasadog.data.entity

import androidx.room.DatabaseView

@DatabaseView
data class BreedAndAllPersonalityView(
    val breedId: Int,
    val sanguineId: Int,
    val cholericId: Int,
    val phlegmaticId: Int,
    val melancholicId: Int
)
