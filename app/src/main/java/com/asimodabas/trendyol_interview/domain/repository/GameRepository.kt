package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.data.dto.GameDTO

interface GameRepository {
    suspend fun getAllGames(): GameDTO

    suspend fun getGameSearch(search: String): GameDTO
}