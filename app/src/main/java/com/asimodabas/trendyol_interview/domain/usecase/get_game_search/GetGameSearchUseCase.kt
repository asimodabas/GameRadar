package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.data.dto.GameDTO

interface GetGameSearchUseCase {

     suspend operator fun invoke(search: String): NetworkCheck<GameDTO>
}