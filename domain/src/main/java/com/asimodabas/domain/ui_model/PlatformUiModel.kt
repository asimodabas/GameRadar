package com.asimodabas.domain.ui_model

data class PlatformUiModel(
    val id: Int,
    val name: String,
    val slug: String?,
    var isSelected: Boolean = false
)