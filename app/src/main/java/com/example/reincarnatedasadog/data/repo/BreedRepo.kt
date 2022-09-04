package com.example.reincarnatedasadog.data.repo

import com.example.reincarnatedasadog.data.entity.BreedAndAllPersonalities

interface BreedRepo {
    fun submit(ids: List<Int>): Set<BreedAndAllPersonalities>
}