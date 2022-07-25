package com.example.reincarnatedasadog.di.data.source


import com.example.reincarnatedasadog.data.source.MelancholicLocalDataSource
import com.example.reincarnatedasadog.data.source.MelancholicLocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MelancholicLocalDataSourceModule {
    @Binds
    abstract fun bindMelancholicLocalDataSource(
        melancholicLocalDataSource: MelancholicLocalDataSourceImpl
    ): MelancholicLocalDataSource
}