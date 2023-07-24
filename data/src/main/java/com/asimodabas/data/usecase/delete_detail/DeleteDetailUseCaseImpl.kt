package com.asimodabas.data.usecase.delete_detail

import com.asimodabas.data.data.repository.GameDetailRoomRepository
import com.asimodabas.domain.model.DetailLocal
import javax.inject.Inject

class DeleteDetailUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository
) : DeleteDetailUseCase {
    override suspend fun invoke(detail: DetailLocal) =
        gameDetailRoomRepository.deleteDetail(detail)
}