package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Breed(
    @PrimaryKey(autoGenerate = true) val breedId: Int = 0,
    val name: String,
    val sanguineId: Int = -1,
    val cholericId: Int = -1,
    val phlegmaticId: Int = -1,
    val melancholicId: Int = -1
)