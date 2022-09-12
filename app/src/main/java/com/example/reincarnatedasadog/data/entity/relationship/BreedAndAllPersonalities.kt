package com.example.reincarnatedasadog.data.entity.relationship

import com.example.reincarnatedasadog.data.entity.*

data class BreedAndAllPersonalities(
    val breed: Breed,
    val breedImageUri: String? = null,
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
