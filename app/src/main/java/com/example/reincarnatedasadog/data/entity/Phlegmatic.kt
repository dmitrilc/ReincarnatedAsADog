package com.example.reincarnatedasadog.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "phlegmatic",
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["id"],
            childColumns = ["id"]
        )
    ]
)
data class Phlegmatic(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "is_calm") val isCalm: Boolean = false,
    @ColumnInfo(name = "is_even_tempered") val isEvenTempered: Boolean = false,
    @ColumnInfo(name = "is_reliable") val isReliable: Boolean = false,
    @ColumnInfo(name = "is_controlled") val isControlled: Boolean = false,
    @ColumnInfo(name = "is_peaceful") val isPeaceful: Boolean = false,
    @ColumnInfo(name = "is_thoughtful") val isThoughtful: Boolean = false,
    @ColumnInfo(name = "is_careful") val isCareful: Boolean = false,
    @ColumnInfo(name = "is_passive") val isPassive: Boolean = false
){
    val truthCount: Int
        get() {
            var count = 0

            if (isCalm) count++
            if (isEvenTempered) count++
            if (isReliable) count++
            if (isControlled) count++
            if (isPeaceful) count++
            if (isThoughtful) count++
            if (isCareful) count++
            if (isPassive) count++

            return count
        }
}
