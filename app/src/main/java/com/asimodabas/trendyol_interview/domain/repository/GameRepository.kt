package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.data.dto.PlatformDTO

interface GameRepository {

    suspend fun getAllGames(nextPage: String): GameDTO

    suspend fun getGameSearch(searchQuery: String, nextPage: String): GameDTO

    suspend fun getGamePlatforms(): PlatformDTO
}