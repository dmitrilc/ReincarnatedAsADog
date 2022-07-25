package com.example.reincarnatedasadog.di.data.source

import com.example.reincarnatedasadog.data.source.PhlegmaticLocalDataSource
import com.example.reincarnatedasadog.data.source.PhlegmaticLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class PhlegmaticLocalDataSourceModule {
    @Binds
    abstract fun bindPhlegmaticLocalDataSource(
        phlegmaticLocalDataSource: PhlegmaticLocalDataSourceImpl
    ): PhlegmaticLocalDataSource
}