package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.data.service.GameAPI
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor(
    private val apiFactory: GameAPI
) : GameRepository {
    override suspend fun getAllGames() = apiFactory.getData()

    override suspend fun getGameSearch(search: String) = apiFactory.getGameSearch(search)

    override suspend fun getGamePlatforms() = apiFactory.getParentPlatform()
}