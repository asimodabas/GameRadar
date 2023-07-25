package com.asimodabas.data.mapper.game

import com.asimodabas.data.dto.GameDTO
import com.asimodabas.domain.ui_model.GameUiModel

interface GameMapper {
    fun map(input: GameDTO) : List<GameUiModel>
}