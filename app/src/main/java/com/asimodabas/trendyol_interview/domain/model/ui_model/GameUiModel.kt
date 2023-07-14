package com.asimodabas.trendyol_interview.domain.model.ui_model

import com.google.gson.annotations.SerializedName

data class GameUiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("background_image") val imageUrl: String?
)