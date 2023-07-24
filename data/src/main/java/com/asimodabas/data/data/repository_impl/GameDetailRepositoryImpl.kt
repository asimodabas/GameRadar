package com.asimodabas.data.data.repository_impl

import com.asimodabas.data.data.repository.GameDetailRepository
import com.asimodabas.data.data.service.GameAPI
import com.asimodabas.domain.model.Detail
import javax.inject.Inject

class GameDetailRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameDetailRepository {
    override suspend fun getGameDetail(id: Int): com.asimodabas.domain.common.NetworkCheck<Detail> =
        com.asimodabas.domain.common.safeApiRequest { apiFactory.getGameDetail(id) }
}