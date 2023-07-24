package com.asimodabas.domain.model

import com.google.gson.annotations.SerializedName

data class Detail(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String?,
    @SerializedName("released") val released: String?,
    @SerializedName("playtime") val playtime: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("reddit_url") val reddit_url: String?,
    @SerializedName("website") val website: String?,
    @SerializedName("genres") val genres: List<Genre>?,
    @SerializedName("publishers") val publishers: List<Publisher>?,
    @SerializedName("metacritic") val metacritic: Int?,
    @SerializedName("background_image") val imageUrl: String?,
    @SerializedName("wishlist") var wishlist: Boolean = false
)