package com.example.reincarnatedasadog.di.repo

import com.example.reincarnatedasadog.data.repo.BreedRepo
import com.example.reincarnatedasadog.data.repo.BreedRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BreedRepoModule {
    @Binds
    abstract fun bindBreedRepo(breedRepo: BreedRepoImpl): BreedRepo

}