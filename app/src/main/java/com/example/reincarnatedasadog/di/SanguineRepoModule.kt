package com.example.reincarnatedasadog.di

import com.example.reincarnatedasadog.data.repo.SanguineRepo
import com.example.reincarnatedasadog.data.repo.SanguineRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SanguineRepoModule {
    @Binds
    abstract fun bindSanguineRepo(sanguineRepo: SanguineRepoImpl): SanguineRepo
}