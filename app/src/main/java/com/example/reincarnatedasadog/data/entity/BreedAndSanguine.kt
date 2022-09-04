package com.example.reincarnatedasadog.data.entity

import androidx.room.Embedded
import androidx.room.Relation

data class BreedAndSanguine(
    @Embedded val breed: Breed,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val sanguine: Sanguine?
)
