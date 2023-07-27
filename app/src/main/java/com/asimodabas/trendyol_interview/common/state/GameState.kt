package com.asimodabas.trendyol_interview.common.state

import androidx.paging.PagingData
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel

data class GameState(
    val success: PagingData<GameUiModel>? = null,
    val error: String? = null
)