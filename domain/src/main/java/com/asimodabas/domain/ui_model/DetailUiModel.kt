package com.asimodabas.domain.ui_model

class DetailUiModel(
    val id: Int,
    val name: String?,
    val released: String?,
    val playtime: String?,
    val description: String?,
    val reddit_url: String?,
    val genres: List<GenreUiModel>,
    val publishers: List<PublisherUiModel>,
    val website: String?,
    val metacritic: Int?,
    val imageUrl: String?,
    var wishlist: Boolean = false
)
