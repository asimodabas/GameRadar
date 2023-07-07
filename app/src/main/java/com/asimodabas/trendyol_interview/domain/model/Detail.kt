package com.asimodabas.trendyol_interview.domain.model

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class Detail(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("released") val released: String?,
    @SerializedName("playtime") val playtime: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("reddit_url") val reddit_url: String?,
    @SerializedName("publisher") val publisher: String?,
    @SerializedName("website") val website: String?,
    @SerializedName("genres") val genres: List<Genre>,
    @SerializedName("metacritic") val metacritic: Int?,
    @ColumnInfo(name = "wishlist") @SerializedName("wishlist") var wishlist: Boolean = false,
    @ColumnInfo(name = "background_image") @SerializedName("background_image") val imageUrl: String?
)