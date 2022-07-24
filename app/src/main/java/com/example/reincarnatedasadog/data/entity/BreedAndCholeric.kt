package com.example.reincarnatedasadog.data.entity

import androidx.room.Relation

data class BreedAndCholeric(
    val choleric: Choleric,
    @Relation(
        parentColumn = "cholericId",
        entityColumn = "breedId"
    )
    val breed: Breed
)
