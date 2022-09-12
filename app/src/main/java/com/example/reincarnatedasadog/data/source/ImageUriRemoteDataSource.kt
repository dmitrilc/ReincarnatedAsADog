package com.example.reincarnatedasadog.data.source

import com.example.reincarnatedasadog.service.HttpService
import com.example.reincarnatedasadog.service.ImageUriResponse
import javax.inject.Inject

interface ImageUriRemoteDataSource {
    suspend fun getImageUri(breedName: String): ImageUriResponse?
}


class ImageUriRemoteDataSourceImpl
@Inject constructor(private val httpService: HttpService)
    : ImageUriRemoteDataSource {
    override suspend fun getImageUri(breedName: String) = httpService.getImageUriByBreed(breedName)

}