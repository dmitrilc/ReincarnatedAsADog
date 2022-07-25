package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["breedId"],
            childColumns = ["melancholicId"]
        )
    ]
)
data class Melancholic(
    @PrimaryKey(autoGenerate = true) val melancholicId: Int = 0,
    val isQuiet: Boolean = false,
    val isUnsociable: Boolean = false,
    val isReserved: Boolean = false,
    val isPessimistic: Boolean = false,
    val isSober: Boolean = false,
    val isRigid: Boolean = false,
    val isAnxious: Boolean = false,
    val isMoody: Boolean = false
)
