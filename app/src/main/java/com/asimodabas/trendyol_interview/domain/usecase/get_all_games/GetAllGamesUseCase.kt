package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel

interface GetAllGamesUseCase {
    suspend operator fun invoke(): NetworkCheck<List<GameUiModel>>
}