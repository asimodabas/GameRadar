package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.data.dto.PlatformDTO

interface GameRepository {
    suspend fun getAllGames(): GameDTO

    suspend fun getGameSearch(search: String): GameDTO

    suspend fun getGamePlatforms(): PlatformDTO
}