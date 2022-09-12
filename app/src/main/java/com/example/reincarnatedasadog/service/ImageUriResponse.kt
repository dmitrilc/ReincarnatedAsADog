package com.example.reincarnatedasadog.service

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageUriResponse(
    @Json(name = "message") val message: String? = null,
)