package com.example.reincarnatedasadog.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.reincarnatedasadog.data.dao.BreedDao
import com.example.reincarnatedasadog.data.entity.Breed
import com.example.reincarnatedasadog.data.entity.Melancholic
import com.example.reincarnatedasadog.data.entity.Phlegmatic
import com.example.reincarnatedasadog.data.entity.Sanguine

@Database(
    entities = [
        Breed::class,
        Sanguine::class,
        Phlegmatic::class,
        Melancholic::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun breedDao(): BreedDao
}
