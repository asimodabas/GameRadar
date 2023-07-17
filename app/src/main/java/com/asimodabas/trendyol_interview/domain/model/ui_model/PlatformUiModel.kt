package com.asimodabas.trendyol_interview.domain.model.ui_model

import com.google.gson.annotations.SerializedName

data class PlatformUiModel(
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("slug") val slug: String?,
)