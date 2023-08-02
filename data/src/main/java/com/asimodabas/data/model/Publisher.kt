package com.asimodabas.data.model

import com.google.gson.annotations.SerializedName

data class Publisher(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("image_background") val imageBackground: String?
)
