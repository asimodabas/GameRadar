package com.asimodabas.data.dto

import com.asimodabas.data.model.Platform
import com.google.gson.annotations.SerializedName

data class PlatformDTO(
    @SerializedName("results") val results: List<Platform>
)