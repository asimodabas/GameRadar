package com.asimodabas.trendyol_interview.domain.usecase.get_details

import com.asimodabas.trendyol_interview.domain.model.ui_model.WishlistUiModel
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
import javax.inject.Inject

class GetDetailsUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository: GameDetailRoomRepository
) : GetDetailsUseCase {
    override suspend fun invoke(): List<WishlistUiModel> =
        gameDetailRoomRepository.getDetails()
}