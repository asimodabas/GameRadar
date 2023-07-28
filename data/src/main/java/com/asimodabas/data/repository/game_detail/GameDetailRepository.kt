package com.asimodabas.data.repository.game_detail

import com.asimodabas.data.model.Detail

interface GameDetailRepository {
    suspend fun getGameDetail(id: Int): Detail
}
