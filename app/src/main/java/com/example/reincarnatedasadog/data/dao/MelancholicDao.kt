package com.example.reincarnatedasadog.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.reincarnatedasadog.data.entity.Melancholic

@Dao
interface MelancholicDao {
    @Insert
    fun insertAll(vararg melancholics: Melancholic)
}