package com.asimodabas.data.data.repository

import com.asimodabas.data.data.dto.GameDTO
import com.asimodabas.data.data.dto.PlatformDTO

interface GameRepository {

    suspend fun getAllGames(nextPage: String): GameDTO

    suspend fun getGameSearch(searchQuery: String, nextPage: String): GameDTO

    suspend fun getGamePlatforms(): PlatformDTO
}