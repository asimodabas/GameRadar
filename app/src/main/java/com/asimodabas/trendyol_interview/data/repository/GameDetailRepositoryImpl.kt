package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.common.Constants.API_KEY
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.data.service.GameAPI
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.repository.BaseRepository
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRepository
import javax.inject.Inject

class GameDetailRepositoryImpl
@Inject constructor(
    private val apiFactory: GameAPI
) : BaseRepository(), GameDetailRepository {

    override suspend fun getGameDetail(
        id: Int
    ): NetworkCheck<Detail> = safeApiRequest {
        apiFactory.getGameDetail(id, API_KEY)
    }
}