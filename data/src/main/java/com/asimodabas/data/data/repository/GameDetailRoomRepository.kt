package com.asimodabas.data.data.repository

import com.asimodabas.domain.model.DetailLocal
import com.asimodabas.domain.ui_model.WishlistUiModel

interface GameDetailRoomRepository {
    suspend fun getDetails(): List<WishlistUiModel>

    suspend fun insertDetail(detail: DetailLocal)

    suspend fun deleteDetail(detail: DetailLocal)
}