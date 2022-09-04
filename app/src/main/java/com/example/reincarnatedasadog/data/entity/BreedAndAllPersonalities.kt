package com.example.reincarnatedasadog.data.entity

import androidx.room.Embedded

data class BreedAndAllPersonalities(
    @Embedded val breed: Breed,
    val sanguine: Sanguine? = null,
    val choleric: Choleric? = null,
    val phlegmatic: Phlegmatic? = null,
    val melancholic: Melancholic? = null
): Comparable<BreedAndAllPersonalities> {

    val totalTruthCount: Int
        get() = (sanguine?.truthCount ?: 0) +
                (choleric?.truthCount ?: 0) +
                (phlegmatic?.truthCount ?: 0) +
                (melancholic?.truthCount ?: 0)

    override fun compareTo(other: BreedAndAllPersonalities): Int {
        return totalTruthCount - other.totalTruthCount
    }

}
