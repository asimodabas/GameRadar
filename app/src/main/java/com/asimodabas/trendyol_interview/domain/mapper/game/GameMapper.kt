package com.asimodabas.trendyol_interview.domain.mapper.game

import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel

interface GameMapper {
    fun map(input: GameDTO) : List<GameUiModel>
}