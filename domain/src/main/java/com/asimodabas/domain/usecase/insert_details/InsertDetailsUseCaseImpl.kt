package com.asimodabas.domain.usecase.insert_details

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.mapper.detail.DetailMapper
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class InsertDetailsUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository,
    private val detailMapper: DetailMapper
) : InsertDetailsUseCase {
    override suspend fun invoke(detail: DetailUiModel) =
        gameDetailRoomRepository.insertDetail(detailMapper.map(detail))
}