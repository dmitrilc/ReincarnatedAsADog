package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "breed")
data class Breed(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val parent: String,
    val sub: String? = null
)