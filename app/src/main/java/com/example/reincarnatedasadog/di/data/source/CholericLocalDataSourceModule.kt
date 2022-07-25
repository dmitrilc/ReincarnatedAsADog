package com.example.reincarnatedasadog.di.data.source

import com.example.reincarnatedasadog.data.source.CholericLocalDataSource
import com.example.reincarnatedasadog.data.source.CholericLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CholericLocalDataSourceModule {
    @Binds
    abstract fun bindCholericLocalDataSource(
        cholericLocalDataSource: CholericLocalDataSourceImpl
    ): CholericLocalDataSource
}