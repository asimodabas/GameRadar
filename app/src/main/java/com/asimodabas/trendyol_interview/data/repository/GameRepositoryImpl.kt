package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.data.service.GameAPI
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameRepository {

    override suspend fun getAllGames(nextPage: String) = apiFactory.getAllData(nextPage)

    override suspend fun getGameSearch(search: String, nextPage: String) = apiFactory.getGameSearch(search, nextPage)

    override suspend fun getGamePlatforms() = apiFactory.getParentPlatform()
}