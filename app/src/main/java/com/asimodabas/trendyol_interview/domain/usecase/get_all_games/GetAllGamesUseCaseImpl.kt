package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.safeApiRequest
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GetAllGamesUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository,
    private val gameMapper: GameMapper
) : GetAllGamesUseCase {
    override suspend fun invoke(): NetworkCheck<List<GameUiModel>> = safeApiRequest {
        gameMapper.map(gameRepository.getAllGames())
    }
}