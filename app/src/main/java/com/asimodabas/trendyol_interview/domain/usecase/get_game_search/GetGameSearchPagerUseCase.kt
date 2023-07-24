package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import androidx.paging.PagingData
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import kotlinx.coroutines.flow.Flow

interface GetGameSearchPagerUseCase {
    operator fun invoke(
        queryString: String, getGameSearchUseCase: GetGameSearchUseCase
    ): Flow<PagingData<GameUiModel>>
}