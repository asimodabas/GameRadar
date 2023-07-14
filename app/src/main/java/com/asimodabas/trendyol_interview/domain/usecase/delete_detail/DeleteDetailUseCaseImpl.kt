package com.asimodabas.trendyol_interview.domain.usecase.delete_detail

import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
import javax.inject.Inject

class DeleteDetailUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository
) : DeleteDetailUseCase {
    override suspend fun invoke(detail: DetailLocal) =
        gameDetailRoomRepository.deleteDetail(detail)
}