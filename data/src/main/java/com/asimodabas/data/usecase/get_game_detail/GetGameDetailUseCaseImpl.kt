package com.asimodabas.data.usecase.get_game_detail

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.model.Detail
import com.asimodabas.data.repository.GameDetailRepository
import javax.inject.Inject

class GetGameDetailUseCaseImpl @Inject constructor(
    private val gameDetailRepository: GameDetailRepository
) : GetGameDetailUseCase {
    override suspend fun invoke(id: Int): NetworkCheck<Detail> =
        gameDetailRepository.getGameDetail(id)
}