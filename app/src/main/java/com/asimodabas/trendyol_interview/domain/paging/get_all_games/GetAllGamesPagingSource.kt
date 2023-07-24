package com.asimodabas.trendyol_interview.domain.paging.get_all_games

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCase

class GetAllGamesPagingSource(
    private val getAllGamesUseCase: GetAllGamesUseCase
) : PagingSource<Int, GameUiModel>() {
    override fun getRefreshKey(state: PagingState<Int, GameUiModel>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPageIndex = state.pages.indexOf(state.closestPageToPosition(anchorPosition))
            state.pages.getOrNull(anchorPageIndex + 1)?.prevKey ?: state.pages.getOrNull(
                anchorPageIndex - 1
            )?.nextKey
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, GameUiModel> {
        val pageIndex = params.key ?: 1
        var loadResult: LoadResult<Int, GameUiModel>? = null
        when (val result = getAllGamesUseCase.invoke(pageIndex.toString())) {
            is NetworkCheck.Success -> {
                val nextKey = if (result.data.isNullOrEmpty()) {
                    null
                } else {
                    pageIndex.plus(1)
                }

                loadResult = LoadResult.Page(
                    data = result.data ?: emptyList(),
                    prevKey = null,
                    nextKey = nextKey
                )
            }

            is NetworkCheck.Error -> {
                loadResult = LoadResult.Error(Throwable(message = result.message))
            }
        }
        return loadResult
    }
}