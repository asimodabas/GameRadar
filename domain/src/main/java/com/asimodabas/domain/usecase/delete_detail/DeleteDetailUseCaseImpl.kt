package com.asimodabas.domain.usecase.delete_detail

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.mapper.detail.DetailMapper
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class DeleteDetailUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository,
    private val detailMapper: DetailMapper
) : DeleteDetailUseCase {
    override suspend fun invoke(detail: DetailUiModel) =
        gameDetailRoomRepository.deleteDetail(detailMapper.map(detail))
}