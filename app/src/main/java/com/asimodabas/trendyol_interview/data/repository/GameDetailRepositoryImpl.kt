package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.safeApiRequest
import com.asimodabas.trendyol_interview.data.service.GameAPI
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRepository
import javax.inject.Inject

class GameDetailRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameDetailRepository {
    override suspend fun getGameDetail(id: Int): NetworkCheck<Detail> =
        safeApiRequest { apiFactory.getGameDetail(id) }
}