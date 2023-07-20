package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.safeApiRequest
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GetGameSearchUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository,
    private val gameMapper: GameMapper
) : GetGameSearchUseCase {
    override suspend fun invoke(query: String, nextPage: String): NetworkCheck<List<GameUiModel>?> =
        safeApiRequest {
            gameMapper.map(gameRepository.getGameSearch(query, nextPage))
        }
}