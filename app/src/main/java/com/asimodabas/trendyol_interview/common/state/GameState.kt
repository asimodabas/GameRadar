package com.asimodabas.trendyol_interview.common.state

import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel

data class GameState(
    val success: List<GameUiModel>? = null,
    val error: String? = null
)