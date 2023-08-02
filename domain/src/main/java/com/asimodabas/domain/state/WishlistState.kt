package com.asimodabas.domain.state

import com.asimodabas.domain.ui_model.DetailUiModel

data class WishlistState(
    val success: List<DetailUiModel>? = null,
    val error: String? = null
)