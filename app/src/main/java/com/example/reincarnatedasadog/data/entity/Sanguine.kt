package com.example.reincarnatedasadog.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "sanguine",
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["id"],
            childColumns = ["id"]
        )
    ]
)
data class Sanguine(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "is_leader") val isLeader: Boolean = false,
    @ColumnInfo(name = "is_carefree") val isCarefree: Boolean = false,
    @ColumnInfo(name = "is_lively") val isLively: Boolean = false,
    @ColumnInfo(name = "is_easygoing") val isEasygoing: Boolean = false,
    @ColumnInfo(name = "is_responsive") val isResponsive: Boolean = false,
    @ColumnInfo(name = "is_talkative") val isTalkative: Boolean = false,
    @ColumnInfo(name = "is_outgoing") val isOutgoing: Boolean = false,
    @ColumnInfo(name = "is_sociable") val isSociable: Boolean = false
)