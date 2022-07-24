package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Choleric(
    @PrimaryKey(autoGenerate = true) val cholericId: Int,
    val isActive: Boolean = false,
    val isOptimistic: Boolean = false,
    val isImpulsive: Boolean = false,
    val isChangeable: Boolean = false,
    val isExcitable: Boolean = false,
    val isAggressive: Boolean = false,
    val isRestless: Boolean = false,
    val isTouchy: Boolean = false
)
