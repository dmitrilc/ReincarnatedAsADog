package com.example.reincarnatedasadog.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Melancholic(
    @PrimaryKey(autoGenerate = true) val melancholicId: Int,
    val isQuiet: Boolean = false,
    val isUnsociable: Boolean = false,
    val isReserved: Boolean = false,
    val isPessimistic: Boolean = false,
    val isSober: Boolean = false,
    val isRigid: Boolean = false,
    val isAnxious: Boolean = false,
    val isMoody: Boolean = false
)
