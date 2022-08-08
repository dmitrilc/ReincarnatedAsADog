package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.data.dao.BreedDao
import com.example.reincarnatedasadog.data.entity.Breed
import javax.inject.Inject

class BreedLocalDataSourceImpl @Inject constructor(private val breedDao: BreedDao) :
    BreedLocalDataSource {
    override fun insert(vararg breeds: Breed) {
        TODO("Not yet implemented")
    }
}