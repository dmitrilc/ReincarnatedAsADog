package com.example.reincarnatedasadog.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.reincarnatedasadog.data.entity.Breed

@Dao
interface BreedDao {
    @Query("SELECT * FROM breed")
    fun getAll(): List<Breed>

    @Query("SELECT * FROM breed WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): Breed
}