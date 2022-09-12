package com.example.reincarnatedasadog.service

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetAllBreedsResponse(
    @Json(name = "message")
    val allBreedsMessage: AllBreedsMessage? = null
)