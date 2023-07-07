package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.data.dto.GameDTO

interface GetAllGamesUseCase {

    suspend operator fun invoke(): NetworkCheck<GameDTO>
}