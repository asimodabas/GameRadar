package com.asimodabas.domain.state

import androidx.paging.PagingData
import com.asimodabas.domain.ui_model.GameUiModel

data class GameState(
    val success: PagingData<GameUiModel>? = null,
    val error: String? = null
)