package com.asimodabas.data.usecase.get_game_search

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.common.safeApiRequest
import com.asimodabas.data.data.mapper.game.GameMapper
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.data.data.repository.GameRepository
import javax.inject.Inject

class GetGameSearchUseCaseImpl @Inject constructor(
    private val gameRepository:  GameRepository,
    private val gameMapper:  GameMapper
) : GetGameSearchUseCase {
    override suspend fun invoke(searchQuery: String, nextPage: String): NetworkCheck<List<GameUiModel>?> =
        safeApiRequest {
            gameMapper.map(gameRepository.getGameSearch(searchQuery, nextPage))
        }
}