package com.example.reincarnatedasadog.di.dao

import com.example.reincarnatedasadog.data.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MelancholicDaoModule {

    @Provides
    fun provideMelancholicDao(db: AppDatabase) = db.melancholicDao()
}