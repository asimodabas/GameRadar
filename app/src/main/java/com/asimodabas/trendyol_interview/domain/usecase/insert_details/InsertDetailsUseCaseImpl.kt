package com.asimodabas.trendyol_interview.domain.usecase.insert_details

import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
import javax.inject.Inject

class InsertDetailsUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository
) : InsertDetailsUseCase {
    override suspend fun invoke(detail: DetailLocal) =
        gameDetailRoomRepository.insertDetail(detail)
}