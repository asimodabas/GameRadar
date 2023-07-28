package com.asimodabas.domain.state

import com.asimodabas.domain.ui_model.DetailUiModel

data class DetailState(
    val success: DetailUiModel? = null,
    val error: String? = null
)