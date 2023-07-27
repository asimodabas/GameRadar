package com.asimodabas.data.repository.game

import com.asimodabas.data.dto.GameDTO
import com.asimodabas.data.dto.PlatformDTO

interface GameRepository {

    suspend fun getAllGames(nextPage: String): GameDTO

    suspend fun getGameSearch(searchQuery: String, nextPage: String): GameDTO

    suspend fun getGamePlatforms(): PlatformDTO
}