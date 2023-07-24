package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import androidx.paging.PagingData
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import kotlinx.coroutines.flow.Flow

interface GetAllGamesPagerUseCase {
    operator fun invoke(): Flow<PagingData<GameUiModel>>
}