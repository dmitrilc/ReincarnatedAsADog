package com.example.reincarnatedasadog.service

import retrofit2.http.GET
import retrofit2.http.Path

private const val TAG = "HTTP_SERVICE"

interface HttpService {
    @GET("breed/{breed}/images/random")
    suspend fun getImageUriByBreed(@Path("breed", encoded=true) breed: String): ImageUriResponse?

    @GET("breeds/list/all")
    suspend fun getAllBreeds(): GetAllBreedsResponse?
}