package com.asimodabas.domain.usecase.get_all_games

import androidx.paging.PagingData
import com.asimodabas.domain.ui_model.GameUiModel
import kotlinx.coroutines.flow.Flow

interface GetAllGamesPagerUseCase {
    operator fun invoke(): Flow<PagingData<GameUiModel>>
}