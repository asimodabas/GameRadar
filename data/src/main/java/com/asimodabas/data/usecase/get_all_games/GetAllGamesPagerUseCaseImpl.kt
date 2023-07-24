package com.asimodabas.data.usecase.get_all_games

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.asimodabas.domain.common.Constants.PAGER_INITIAL_LOAD_SIZE
import com.asimodabas.domain.common.Constants.PAGER_PAGE_SIZE
import com.asimodabas.domain.common.Constants.PAGER_PLACE_HOLDER_STATE
import com.asimodabas.domain.common.Constants.PAGER_PREFETCH_DISTANCE_SIZE
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.data.paging.get_all_games.GetAllGamesPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllGamesPagerUseCaseImpl @Inject constructor(
    private val getAllGamesUseCase: GetAllGamesUseCase
) : GetAllGamesPagerUseCase {
    override fun invoke(): Flow<PagingData<GameUiModel>> = Pager(
        config = PagingConfig(
            pageSize = PAGER_PAGE_SIZE,
            enablePlaceholders = PAGER_PLACE_HOLDER_STATE,
            initialLoadSize = PAGER_INITIAL_LOAD_SIZE,
            prefetchDistance = PAGER_PREFETCH_DISTANCE_SIZE
        ),
        pagingSourceFactory = {
            GetAllGamesPagingSource(getAllGamesUseCase)
        }
    ).flow
}