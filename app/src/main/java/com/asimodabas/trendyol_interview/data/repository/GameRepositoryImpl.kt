package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.data.service.GameAPI
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameRepository {

    override suspend fun getAllGames(nextPage: String) = apiFactory.getAllData(nextPage)

    override suspend fun getGameSearch(searchQuery: String, nextPage: String) = apiFactory.getGameSearch(searchQuery, nextPage)

    override suspend fun getGamePlatforms() = apiFactory.getParentPlatform()
}