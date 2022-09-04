package com.example.reincarnatedasadog.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class BreedAndMelancholic(
    @Embedded val breed: Breed,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val melancholic: Melancholic?
)
