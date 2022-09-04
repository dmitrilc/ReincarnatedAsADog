package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.entity.Choleric
import com.example.reincarnatedasadog.data.entity.Melancholic
import com.example.reincarnatedasadog.data.entity.Phlegmatic
import com.example.reincarnatedasadog.data.entity.Sanguine

interface BreedLocalDataSource {

    fun getBreedsAndMatchingPersonalities(
        sanguine: Sanguine,
        choleric: Choleric,
        phlegmatic: Phlegmatic,
        melancholic: Melancholic
    ): NTuple4

}