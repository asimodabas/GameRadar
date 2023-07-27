package com.asimodabas.data.repository.game_detail_room

import com.asimodabas.domain.model.DetailLocal
import com.asimodabas.domain.ui_model.WishlistUiModel

interface GameDetailRoomRepository {
    suspend fun getDetails(): List<WishlistUiModel>

    suspend fun insertDetail(detail: DetailLocal)

    suspend fun deleteDetail(detail: DetailLocal)
}