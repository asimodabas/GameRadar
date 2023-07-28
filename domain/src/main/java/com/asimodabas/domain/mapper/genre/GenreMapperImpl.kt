package com.asimodabas.domain.mapper.genre

import com.asimodabas.data.model.Genre
import com.asimodabas.domain.ui_model.GenreUiModel
import javax.inject.Inject

class GenreMapperImpl @Inject constructor() : GenreMapper {
    override fun map(input: GenreUiModel): Genre =
        Genre(
            id = input.id,
            name = input.name,
            imageBackground = input.imageBackground
        )
}