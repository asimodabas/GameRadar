package com.asimodabas.data.data.mapper.game

import com.asimodabas.data.data.dto.GameDTO
import com.asimodabas.domain.ui_model.GameUiModel

interface GameMapper {
    fun map(input: GameDTO) : List<GameUiModel>
}