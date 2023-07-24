package com.asimodabas.data.usecase.get_details

import com.asimodabas.domain.ui_model.WishlistUiModel
import com.asimodabas.data.data.repository.GameDetailRoomRepository
import javax.inject.Inject

class GetDetailsUseCaseImpl @Inject constructor(
    private val gameDetailRoomRepository:  GameDetailRoomRepository
) : GetDetailsUseCase {
    override suspend fun invoke(): List<WishlistUiModel> =
        gameDetailRoomRepository.getDetails()
}