package com.asimodabas.trendyol_interview.domain.model.ui_model

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class GameUiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @ColumnInfo(name = "background_image") @SerializedName("background_image") val imageUrl: String?
)