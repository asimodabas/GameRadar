package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.paging.get_all_games.GetAllGamesPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllGamesPagerUseCaseImpl @Inject constructor(
    private val getAllGamesUseCase: GetAllGamesUseCase
) : GetAllGamesPagerUseCase {
    override fun invoke(): Flow<PagingData<GameUiModel>> = Pager(
        config = PagingConfig(
            pageSize = 10,
            enablePlaceholders = false,
            initialLoadSize = 10,
            prefetchDistance = 5
        ),
        pagingSourceFactory = {
            GetAllGamesPagingSource(getAllGamesUseCase)
        }
    ).flow
}