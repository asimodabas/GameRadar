package com.asimodabas.trendyol_interview.domain.mapper

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel

fun Detail.toUiModel(): GameUiModel = GameUiModel(
    id,
    name,
    imageUrl
)