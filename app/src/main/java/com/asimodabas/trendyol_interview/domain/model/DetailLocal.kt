package com.asimodabas.trendyol_interview.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games")
data class DetailLocal(
    @PrimaryKey val id: Int,
    val name: String?,
    val released: String?,
    val playtime: String?,
    val description: String?,
    val reddit_url: String?,
    val website: String?,
    val metacritic: Int?,
    var wishlist: Boolean = false,
    val background_image: String?
)