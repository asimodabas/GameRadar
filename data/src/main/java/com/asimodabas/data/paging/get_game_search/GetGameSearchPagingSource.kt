package com.asimodabas.data.paging.get_game_search

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.data.usecase.get_game_search.GetGameSearchUseCase

class GetGameSearchPagingSource(
    private val queryString: String,
    private val getGameSearchUseCase: GetGameSearchUseCase
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
        when (val result = getGameSearchUseCase.invoke(queryString, pageIndex.toString())) {
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