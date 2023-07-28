package com.asimodabas.data.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("games")
data class Detail @JvmOverloads constructor(
    @PrimaryKey
    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String?,
    @SerializedName("released") var released: String?,
    @SerializedName("playtime") var playtime: String?,
    @SerializedName("description") var description: String?,
    @SerializedName("reddit_url") var reddit_url: String?,
    @SerializedName("website") var website: String?,
    @Ignore
    @SerializedName("genres") val genres: List<Genre> = listOf(),
    @Ignore
    @SerializedName("publishers") val publishers: List<Publisher> = listOf(),
    @SerializedName("metacritic") var metacritic: Int?,
    @SerializedName("background_image") var imageUrl: String?,
    @SerializedName("wishlist") var wishlist: Boolean = false,
)