package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.common.Constants.API_KEY
import com.asimodabas.trendyol_interview.data.service.GameAPI
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameRepository {
    override suspend fun getAllGames() = apiFactory.getData(API_KEY)

    override suspend fun getGameSearch(search: String) = apiFactory.getGameSearch(search, API_KEY)
}