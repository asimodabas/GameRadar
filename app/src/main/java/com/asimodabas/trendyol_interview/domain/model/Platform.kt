package com.asimodabas.trendyol_interview.domain.model

import com.google.gson.annotations.SerializedName

data class Platform(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String,
    @SerializedName("slug") val slug: String?,
)