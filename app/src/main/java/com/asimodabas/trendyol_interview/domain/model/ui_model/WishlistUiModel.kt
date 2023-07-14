package com.asimodabas.trendyol_interview.domain.model.ui_model

import com.google.gson.annotations.SerializedName

data class WishlistUiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("released") val released: String?,
    @SerializedName("metacritic") val metacritic: Int?,
    @SerializedName("wishlist") var wishlist: Boolean = false,
    @SerializedName("background_image") val background_image: String?
)