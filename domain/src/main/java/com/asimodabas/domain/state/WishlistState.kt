package com.asimodabas.domain.state

import com.asimodabas.domain.ui_model.WishlistUiModel

data class WishlistState(
    val success: List<WishlistUiModel>? = null,
    val error: String? = null
)