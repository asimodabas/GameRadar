package com.asimodabas.data.usecase.get_game_search

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.ui_model.GameUiModel

interface GetGameSearchUseCase {
    suspend operator fun invoke(searchQuery: String, nextPage: String): NetworkCheck<List<GameUiModel>?>
}