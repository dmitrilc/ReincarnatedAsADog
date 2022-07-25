package com.example.reincarnatedasadog.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.reincarnatedasadog.data.entity.Phlegmatic

@Dao
interface PhlegmaticDao {

    @Insert
    fun insertAll(vararg phlegmatics: Phlegmatic)
}