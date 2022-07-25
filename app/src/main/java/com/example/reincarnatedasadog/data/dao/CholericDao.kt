package com.example.reincarnatedasadog.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.reincarnatedasadog.data.entity.Choleric

@Dao
interface CholericDao {

    @Insert
    fun insertAll(vararg choleric: Choleric)
}