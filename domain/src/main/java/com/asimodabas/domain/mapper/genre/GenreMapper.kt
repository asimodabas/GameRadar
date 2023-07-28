package com.asimodabas.domain.mapper.genre

import com.asimodabas.data.model.Genre
import com.asimodabas.domain.ui_model.GenreUiModel

interface GenreMapper {
    fun map(input: GenreUiModel): Genre
}