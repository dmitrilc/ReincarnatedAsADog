package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["breedId"],
            childColumns = ["cholericId"]
        )
    ]
)
data class Choleric(
    @PrimaryKey(autoGenerate = true) val cholericId: Int = 0,
    val isActive: Boolean = false,
    val isOptimistic: Boolean = false,
    val isImpulsive: Boolean = false,
    val isChangeable: Boolean = false,
    val isExcitable: Boolean = false,
    val isAggressive: Boolean = false,
    val isRestless: Boolean = false,
    val isTouchy: Boolean = false
)
