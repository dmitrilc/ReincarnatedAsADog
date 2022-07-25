package com.example.reincarnatedasadog.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.reincarnatedasadog.data.dao.*
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
    abstract fun sanguineDao(): SanguineDao
    abstract fun cholericDao(): CholericDao
    abstract fun phlegmaticDao(): PhlegmaticDao
    abstract fun melancholicDao(): MelancholicDao
}
