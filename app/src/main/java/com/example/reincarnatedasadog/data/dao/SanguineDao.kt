package com.example.reincarnatedasadog.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.reincarnatedasadog.data.entity.Sanguine

@Dao
interface SanguineDao {
    @Insert
    fun insertAll(vararg sanguines: Sanguine)
}