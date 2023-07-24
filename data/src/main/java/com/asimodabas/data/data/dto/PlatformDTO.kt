package com.asimodabas.data.data.dto

import com.asimodabas.domain.model.Platform
import com.google.gson.annotations.SerializedName

data class PlatformDTO(
    @SerializedName("results") val results: List<Platform>
)