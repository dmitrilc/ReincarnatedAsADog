package com.example.reincarnatedasadog.di.data.source

import com.example.reincarnatedasadog.data.source.ImageUriRemoteDataSource
import com.example.reincarnatedasadog.data.source.ImageUriRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteImageUriDataSourceModule {
    @Binds
    abstract fun bindImageUriRemoteDataSource(
        imageUriRemoteImageUriDataSource: ImageUriRemoteDataSourceImpl
    ): ImageUriRemoteDataSource
}