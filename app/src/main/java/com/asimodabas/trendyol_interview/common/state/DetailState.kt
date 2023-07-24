package com.asimodabas.trendyol_interview.common.state

import com.asimodabas.trendyol_interview.domain.model.Detail

data class DetailState(
    val success: Detail? = null,
    val error: String? = null
)