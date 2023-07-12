package com.asimodabas.trendyol_interview.common.state

data class CheckState(
    val isTextPlaytime: Boolean = false,
    val isTextReleased: Boolean = false,
    val isTextPublisher: Boolean = false,
    val isTextGenres: Boolean = false,
    val isTextMetacritic: Boolean = false,
)