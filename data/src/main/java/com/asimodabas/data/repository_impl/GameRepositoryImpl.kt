package com.asimodabas.data.repository_impl

import com.asimodabas.data.repository.GameRepository
import com.asimodabas.data.service.GameAPI
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameRepository {

    override suspend fun getAllGames(nextPage: String) = apiFactory.getAllData(nextPage)

    override suspend fun getGameSearch(searchQuery: String, nextPage: String) = apiFactory.getGameSearch(searchQuery, nextPage)

    override suspend fun getGamePlatforms() = apiFactory.getParentPlatform()
}