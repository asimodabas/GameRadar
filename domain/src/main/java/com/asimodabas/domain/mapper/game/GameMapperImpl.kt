package com.asimodabas.domain.mapper.game

import com.asimodabas.data.dto.GameDTO
import com.asimodabas.domain.ui_model.GameUiModel
import javax.inject.Inject

class GameMapperImpl @Inject constructor() : GameMapper {
    override fun map(input: GameDTO): List<GameUiModel> =
        input.results.map {
            GameUiModel(
                id = it.id,
                name = it.name,
                imageUrl = it.imageUrl
            )
        }
}