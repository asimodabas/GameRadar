package com.asimodabas.trendyol_interview.domain.mapper.game

import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import javax.inject.Inject

class GameMapperImpl @Inject constructor() : GameMapper {
    override fun map(input: GameDTO): List<GameUiModel> =
        input.results.map {
            GameUiModel(
                it.id, it.name, it.imageUrl
            )
        }
}