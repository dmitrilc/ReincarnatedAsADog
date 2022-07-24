package com.example.reincarnatedasadog.data.entity

import androidx.room.Relation

data class BreedAndPhlegmatic(
    val phlegmatic: Phlegmatic,
    @Relation(
        parentColumn = "phlegmaticId",
        entityColumn = "breedId"
    )
    val breed: Breed
)
