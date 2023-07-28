package com.asimodabas.domain.mapper.genre

import com.asimodabas.data.model.Genre
import com.asimodabas.domain.ui_model.GenreUiModel
import javax.inject.Inject

class GenreUiMapperImpl @Inject constructor() : GenreUiMapper {
    override fun map(input: Genre): GenreUiModel =
        GenreUiModel(
            id = input.id,
            name = input.name,
            imageBackground = input.imageBackground
        )
}