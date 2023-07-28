package com.asimodabas.domain.usecase.get_game_detail

import com.asimodabas.data.repository.game_detail.GameDetailRepository
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.mapper.detail.DetailUiMapper
import com.asimodabas.domain.common.safeApiRequest
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class GetGameDetailUseCaseImpl @Inject constructor(
    private val gameDetailRepository: GameDetailRepository,
    private val detailUiMapper: DetailUiMapper
) : GetGameDetailUseCase {
    override suspend fun invoke(id: Int): NetworkCheck<DetailUiModel> =
        safeApiRequest {
            detailUiMapper.map(gameDetailRepository.getGameDetail(id))
        }
}