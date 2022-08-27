package com.example.reincarnatedasadog.di.data.source

import com.example.reincarnatedasadog.data.source.BreedLocalDataSource
import com.example.reincarnatedasadog.data.source.BreedLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BreedLocalDataSourceModule {
    @Binds
    abstract fun bindBreedLocalDataSource(
        breedLocalDataSource: BreedLocalDataSourceImpl
    ): BreedLocalDataSource
}