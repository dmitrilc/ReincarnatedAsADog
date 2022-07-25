package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["breedId"],
            childColumns = ["sanguineId"]
        )
    ]
)
data class Sanguine(
    @PrimaryKey(autoGenerate = true) val sanguineId: Int = 0,
    val isLeader: Boolean = false,
    val isCarefree: Boolean = false,
    val isLively: Boolean = false,
    val isEasygoing: Boolean = false,
    val isResponsive: Boolean = false,
    val isTalkative: Boolean = false,
    val isOutgoing: Boolean = false,
    val isSociable: Boolean = false
)