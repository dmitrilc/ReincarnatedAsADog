package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Sanguine(
    @PrimaryKey(autoGenerate = true) val sanguineId: Int,
    val isLeader: Boolean = false,
    val isCarefree: Boolean = false,
    val isLively: Boolean = false,
    val isEasygoing: Boolean = false,
    val isResponsive: Boolean = false,
    val isTalkative: Boolean = false,
    val isOutgoing: Boolean = false,
    val isSociable: Boolean = false
)