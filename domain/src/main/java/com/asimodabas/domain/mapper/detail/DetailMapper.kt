package com.asimodabas.domain.mapper.detail

import com.asimodabas.data.model.Detail
import com.asimodabas.domain.ui_model.DetailUiModel

interface DetailMapper {
    fun map(input: DetailUiModel): Detail
}