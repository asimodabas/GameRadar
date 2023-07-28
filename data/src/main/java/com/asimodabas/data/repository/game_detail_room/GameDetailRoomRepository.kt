package com.asimodabas.data.repository.game_detail_room

import com.asimodabas.data.model.Detail

interface GameDetailRoomRepository {
    suspend fun getDetails(): List<Detail>

    suspend fun insertDetail(detail: Detail)

    suspend fun deleteDetail(detail: Detail)
}