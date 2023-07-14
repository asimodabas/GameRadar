package com.asimodabas.trendyol_interview.domain.model.ui_model

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class WishlistUiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("released") val released: String?,
    @SerializedName("metacritic") val metacritic: Int?,
    @ColumnInfo(name = "wishlist") @SerializedName("wishlist") var wishlist: Boolean = false,
    @ColumnInfo(name = "background_image") @SerializedName("background_image") val background_image: String?
)