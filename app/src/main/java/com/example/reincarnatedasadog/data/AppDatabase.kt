package com.example.reincarnatedasadog.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.reincarnatedasadog.data.dao.BreedDao
import com.example.reincarnatedasadog.data.entity.*

@Database(
    entities = [
        Breed::class,
        Sanguine::class,
        Choleric::class,
        Phlegmatic::class,
        Melancholic::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun breedDao(): BreedDao
}
