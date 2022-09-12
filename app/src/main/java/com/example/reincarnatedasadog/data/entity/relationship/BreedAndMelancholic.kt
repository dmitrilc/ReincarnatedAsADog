package com.example.reincarnatedasadog.data.entity.relationship

import androidx.room.Embedded
import androidx.room.Relation
import com.example.reincarnatedasadog.data.entity.Breed
import com.example.reincarnatedasadog.data.entity.Melancholic

data class BreedAndMelancholic(
    @Embedded val breed: Breed,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val melancholic: Melancholic?
)
