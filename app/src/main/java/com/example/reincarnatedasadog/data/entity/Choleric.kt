package com.example.reincarnatedasadog.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "choleric",
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["id"],
            childColumns = ["id"]
        )
    ]
)
data class Choleric(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "is_active") val isActive: Boolean = false,
    @ColumnInfo(name = "is_optimistic") val isOptimistic: Boolean = false,
    @ColumnInfo(name = "is_impulsive") val isImpulsive: Boolean = false,
    @ColumnInfo(name = "is_changeable") val isChangeable: Boolean = false,
    @ColumnInfo(name = "is_excitable") val isExcitable: Boolean = false,
    @ColumnInfo(name = "is_aggressive") val isAggressive: Boolean = false,
    @ColumnInfo(name = "is_restless") val isRestless: Boolean = false,
    @ColumnInfo(name = "is_touchy") val isTouchy: Boolean = false
)
