package com.asimodabas.trendyol_interview.domain.usecase.get_game_detail

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRepository
import javax.inject.Inject

class GetGameDetailUseCaseImpl @Inject constructor(
    private val gameDetailRepository: GameDetailRepository
) : GetGameDetailUseCase {
    override suspend fun invoke(id: Int): NetworkCheck<Detail> =
        gameDetailRepository.getGameDetail(id)
}