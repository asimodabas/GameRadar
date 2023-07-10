package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.safeApiRequest
import com.asimodabas.trendyol_interview.domain.mapper.toUiModel
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GetGameSearchUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository
) : GetGameSearchUseCase {
    override suspend fun invoke(query: String): NetworkCheck<List<GameUiModel>?> = safeApiRequest {
        gameRepository.getGameSearch(query).results.map { it.toUiModel() }
    }
}