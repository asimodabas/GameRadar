package com.asimodabas.trendyol_interview.domain.model.ui_model

data class PlatformUiModel(
    val id: Int,
    val name: String,
    val slug: String?,
    var isSelected: Boolean = false
)