package com.asimodabas.domain.usecase.get_game_search

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.asimodabas.data.Constants.PAGER_INITIAL_LOAD_SIZE
import com.asimodabas.data.Constants.PAGER_PAGE_SIZE
import com.asimodabas.data.Constants.PAGER_PLACE_HOLDER_STATE
import com.asimodabas.data.Constants.PAGER_PREFETCH_DISTANCE_SIZE
import com.asimodabas.domain.paging.get_game_search.GetGameSearchPagingSource
import com.asimodabas.domain.ui_model.GameUiModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetGameSearchPagerUseCaseImpl @Inject constructor(
) : GetGameSearchPagerUseCase {
    override fun invoke(
        queryString: String, getGameSearchUseCase: GetGameSearchUseCase
    ): Flow<PagingData<GameUiModel>> = Pager(
        config = PagingConfig(
            pageSize = PAGER_PAGE_SIZE,
            enablePlaceholders = PAGER_PLACE_HOLDER_STATE,
            initialLoadSize = PAGER_INITIAL_LOAD_SIZE,
            prefetchDistance = PAGER_PREFETCH_DISTANCE_SIZE
        ),
        pagingSourceFactory = {
            GetGameSearchPagingSource(queryString, getGameSearchUseCase)
        }
    ).flow
}