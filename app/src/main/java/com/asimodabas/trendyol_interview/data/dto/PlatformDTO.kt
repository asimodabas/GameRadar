package com.asimodabas.trendyol_interview.data.dto

import com.asimodabas.trendyol_interview.domain.model.Platform
import com.google.gson.annotations.SerializedName

data class PlatformDTO(
    @SerializedName("results") val results: List<Platform>
)