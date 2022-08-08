package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.entity.Breed

interface BreedLocalDataSource {
    fun insert(vararg breeds: Breed)
}