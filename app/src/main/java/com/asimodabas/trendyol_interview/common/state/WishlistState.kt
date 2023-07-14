package com.asimodabas.trendyol_interview.common.state

import com.asimodabas.trendyol_interview.domain.model.ui_model.WishlistUiModel

data class WishlistState(
    val success: List<WishlistUiModel>? = null,
    val error: String? = null
)