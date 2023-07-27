package com.asimodabas.data.repository.game_detail

import com.asimodabas.data.service.GameAPI
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.model.Detail
import javax.inject.Inject

class GameDetailRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameDetailRepository {
    override suspend fun getGameDetail(id: Int): NetworkCheck<Detail> =
        com.asimodabas.domain.common.safeApiRequest { apiFactory.getGameDetail(id) }
}