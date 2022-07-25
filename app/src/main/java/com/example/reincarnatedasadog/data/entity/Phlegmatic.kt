package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["breedId"],
            childColumns = ["phlegmaticId"]
        )
    ]
)
data class Phlegmatic(
    @PrimaryKey(autoGenerate = true) val phlegmaticId: Int = 0,
    val isCalm: Boolean = false,
    val isEvenTempered: Boolean = false,
    val isReliable: Boolean = false,
    val isControlled: Boolean = false,
    val isPeaceful: Boolean = false,
    val isThoughtful: Boolean = false,
    val isCareful: Boolean = false,
    val isPassive: Boolean = false
)
