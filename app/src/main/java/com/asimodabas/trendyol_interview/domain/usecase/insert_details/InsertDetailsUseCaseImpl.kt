package com.asimodabas.trendyol_interview.domain.usecase.insert_details

import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.repository.RoomRepository
import javax.inject.Inject

class InsertDetailsUseCaseImpl @Inject constructor(
    private val roomRepository: RoomRepository
) : InsertDetailsUseCase {
    override suspend fun invoke(detail: DetailLocal) =
        roomRepository.insertDetail(detail)
}