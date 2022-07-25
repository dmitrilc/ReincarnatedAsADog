package com.example.reincarnatedasadog.di.data.source

import com.example.reincarnatedasadog.data.source.SanguineLocalDataSource
import com.example.reincarnatedasadog.data.source.SanguineLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SanguineLocalDataSourceModule {
    @Binds
    abstract fun bindSanguineLocalDataSource(sanguineLocalDataSource: SanguineLocalDataSourceImpl): SanguineLocalDataSource
}