package com.asimodabas.trendyol_interview.common.state

import com.asimodabas.trendyol_interview.data.dto.GameDTO

data class GetGameState(
    val success: GameDTO? = null,
    val error: String? = null
)