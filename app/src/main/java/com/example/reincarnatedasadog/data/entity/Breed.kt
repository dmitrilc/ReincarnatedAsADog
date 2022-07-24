package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Breed(
    @PrimaryKey(autoGenerate = true) val breedId: Int,
    val name: String,
    val sanguineId: Int,
    val cholericId: Int,
    val phlegmaticId: Int,
    val melancholicId: Int
)