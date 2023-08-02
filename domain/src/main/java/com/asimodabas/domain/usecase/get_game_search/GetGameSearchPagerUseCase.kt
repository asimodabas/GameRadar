package com.asimodabas.domain.usecase.get_game_search

import androidx.paging.PagingData
import com.asimodabas.domain.ui_model.GameUiModel
import kotlinx.coroutines.flow.Flow

interface GetGameSearchPagerUseCase {
    operator fun invoke(queryString: String, getGameSearchUseCase: GetGameSearchUseCase): Flow<PagingData<GameUiModel>>
}