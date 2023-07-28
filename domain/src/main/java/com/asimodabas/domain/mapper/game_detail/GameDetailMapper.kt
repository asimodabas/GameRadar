package com.asimodabas.domain.mapper.game_detail

import com.asimodabas.data.model.Detail
import com.asimodabas.domain.ui_model.DetailUiModel

interface GameDetailMapper {
    fun map(input: List<Detail>) : List<DetailUiModel>
}