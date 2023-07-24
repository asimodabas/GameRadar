package com.asimodabas.data.usecase.get_all_games

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.ui_model.GameUiModel

interface GetAllGamesUseCase {
    suspend operator fun invoke(nextPage: String): NetworkCheck<List<GameUiModel>>
}