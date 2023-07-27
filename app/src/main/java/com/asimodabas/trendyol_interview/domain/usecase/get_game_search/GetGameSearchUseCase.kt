package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel

interface GetGameSearchUseCase {
    suspend operator fun invoke(searchQuery: String, nextPage: String): NetworkCheck<List<GameUiModel>?>
}