package com.asimodabas.trendyol_interview.common.state

import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

data class PlatformState(
    val success: List<PlatformUiModel>? = null,
    val error: String? = null
)