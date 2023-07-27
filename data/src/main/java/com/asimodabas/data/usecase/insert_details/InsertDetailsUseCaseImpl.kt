package com.asimodabas.data.usecase.insert_details

import com.asimodabas.domain.model.DetailLocal
import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import javax.inject.Inject

class InsertDetailsUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository
) : InsertDetailsUseCase {
    override suspend fun invoke(detail: DetailLocal) =
        gameDetailRoomRepository.insertDetail(detail)
}