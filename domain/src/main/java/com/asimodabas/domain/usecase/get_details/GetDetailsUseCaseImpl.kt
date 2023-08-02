package com.asimodabas.domain.usecase.get_details

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.mapper.game_detail.GameDetailMapper
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class GetDetailsUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository,
    private val gameDetailMapper: GameDetailMapper
) : GetDetailsUseCase {
    override suspend fun invoke(): List<DetailUiModel> =
        gameDetailMapper.map(gameDetailRoomRepository.getDetails())
}