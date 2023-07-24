package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.model.ui_model.WishlistUiModel

interface GameDetailRoomRepository {
    suspend fun getDetails(): List<WishlistUiModel>

    suspend fun insertDetail(detail: DetailLocal)

    suspend fun deleteDetail(detail: DetailLocal)
}