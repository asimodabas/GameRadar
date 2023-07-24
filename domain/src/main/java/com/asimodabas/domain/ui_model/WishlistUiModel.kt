package com.asimodabas.domain.ui_model

data class WishlistUiModel(
    val id: Int,
    val name: String?,
    val released: String?,
    val metacritic: Int?,
    var wishlist: Boolean = false,
    val background_image: String?
)