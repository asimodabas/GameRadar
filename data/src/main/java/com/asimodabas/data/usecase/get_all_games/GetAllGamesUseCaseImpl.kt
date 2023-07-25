package com.asimodabas.data.usecase.get_all_games

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.common.safeApiRequest
import com.asimodabas.data.mapper.game.GameMapper
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.data.repository.GameRepository
import javax.inject.Inject

class GetAllGamesUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository,
    private val gameMapper: GameMapper
) : GetAllGamesUseCase {
    override suspend fun invoke(nextPage: String): NetworkCheck<List<GameUiModel>> =
        safeApiRequest {
            gameMapper.map(gameRepository.getAllGames(nextPage))
        }
}