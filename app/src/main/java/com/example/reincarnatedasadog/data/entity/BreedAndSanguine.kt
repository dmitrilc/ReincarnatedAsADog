package com.example.reincarnatedasadog.data.entity

import androidx.room.Relation

data class BreedAndSanguine(
    val sanguine: Sanguine,
    @Relation(
        parentColumn = "sanguineId",
        entityColumn = "breedId"
    )
    val breed: Breed
)
