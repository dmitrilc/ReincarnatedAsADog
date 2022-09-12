package com.example.reincarnatedasadog.data.entity.relationship

import androidx.room.Embedded
import androidx.room.Relation
import com.example.reincarnatedasadog.data.entity.Breed
import com.example.reincarnatedasadog.data.entity.Phlegmatic

data class BreedAndPhlegmatic(
    @Embedded val breed: Breed,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val phlegmatic: Phlegmatic?
)
