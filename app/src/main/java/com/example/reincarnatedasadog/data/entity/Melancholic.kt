package com.example.reincarnatedasadog.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "melancholic",
    foreignKeys = [
        ForeignKey(
            entity = Breed::class,
            parentColumns = ["id"],
            childColumns = ["id"]
        )
    ]
)
data class Melancholic(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "is_quiet") val isQuiet: Boolean = false,
    @ColumnInfo(name = "is_unsociable") val isUnsociable: Boolean = false,
    @ColumnInfo(name = "is_reserved") val isReserved: Boolean = false,
    @ColumnInfo(name = "is_pessimistic") val isPessimistic: Boolean = false,
    @ColumnInfo(name = "is_sober") val isSober: Boolean = false,
    @ColumnInfo(name = "is_rigid") val isRigid: Boolean = false,
    @ColumnInfo(name = "is_anxious") val isAnxious: Boolean = false,
    @ColumnInfo(name = "is_moody") val isMoody: Boolean = false
){
    val truthCount: Int
        get() {
            var count = 0

            if (isQuiet) count++
            if (isUnsociable) count++
            if (isReserved) count++
            if (isPessimistic) count++
            if (isSober) count++
            if (isRigid) count++
            if (isAnxious) count++
            if (isMoody) count++

            return count
        }
}
