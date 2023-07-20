package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.paging.get_game_search.GetGameSearchPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetGameSearchPagerUseCaseImpl @Inject constructor(
) : GetGameSearchPagerUseCase {
    override fun invoke(
        queryString: String, getGameSearchUseCase: GetGameSearchUseCase
    ): Flow<PagingData<GameUiModel>> = Pager(
        config = PagingConfig(
            pageSize = 10,
            enablePlaceholders = false,
            initialLoadSize = 10,
            prefetchDistance = 5
        ),
        pagingSourceFactory = {
            GetGameSearchPagingSource(queryString, getGameSearchUseCase)
        }
    ).flow
}