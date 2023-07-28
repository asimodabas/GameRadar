package com.asimodabas.data.repository.game_detail

import com.asimodabas.data.model.Detail
import com.asimodabas.data.service.GameAPI
import javax.inject.Inject

class GameDetailRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameDetailRepository {
    override suspend fun getGameDetail(id: Int): Detail = apiFactory.getGameDetail(id)
}