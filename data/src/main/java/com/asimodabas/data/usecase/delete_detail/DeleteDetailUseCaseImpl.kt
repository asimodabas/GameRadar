package com.asimodabas.data.usecase.delete_detail

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.model.DetailLocal
import javax.inject.Inject

class DeleteDetailUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository
) : DeleteDetailUseCase {
    override suspend fun invoke(detail: DetailLocal) =
        gameDetailRoomRepository.deleteDetail(detail)
}