package com.example.reincarnatedasadog.data.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Breed(
    @PrimaryKey(autoGenerate = true) val breedId: Int = 0,
    val name: String,
    @Embedded(prefix = "sanguine") val sanguine: Sanguine?,
    @Embedded(prefix = "choleric") val choleric: Choleric?,
    @Embedded(prefix = "phlegmatic") val phlegmatic: Phlegmatic?,
    @Embedded(prefix = "melancholic") val melancholic: Melancholic?
/*    val sanguineId: Int = -1,
    val cholericId: Int = -1,
    val phlegmaticId: Int = -1,
    val melancholicId: Int = -1*/
)