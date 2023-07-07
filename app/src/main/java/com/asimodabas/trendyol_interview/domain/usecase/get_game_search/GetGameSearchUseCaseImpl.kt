package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GetGameSearchUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository
) : GetGameSearchUseCase {

    override suspend fun invoke(search: String): NetworkCheck<GameDTO> =
        gameRepository.getGameSearch(search)

}