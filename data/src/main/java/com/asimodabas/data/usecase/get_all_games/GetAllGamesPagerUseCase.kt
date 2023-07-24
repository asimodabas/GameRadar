package com.asimodabas.data.usecase.get_all_games

import androidx.paging.PagingData
import com.asimodabas.domain.ui_model.GameUiModel
import kotlinx.coroutines.flow.Flow

interface GetAllGamesPagerUseCase {
    operator fun invoke(): Flow<PagingData<GameUiModel>>
}