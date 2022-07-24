package com.example.reincarnatedasadog.data.entity

import androidx.room.Relation

data class BreedAndMelancholic(
    val melancholic: Melancholic,
    @Relation(
        parentColumn = "melancholicId",
        entityColumn = "breedId"
    )
    val breed: Breed
)
