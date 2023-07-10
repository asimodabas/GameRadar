package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.domain.model.DetailLocal

interface RoomRepository {
    suspend fun getDetails(): List<DetailLocal>

    suspend fun insertDetail(detail: DetailLocal)

    suspend fun deleteDetail(detail: DetailLocal)
}