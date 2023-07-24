package com.asimodabas.domain.state

import com.asimodabas.domain.model.Detail

data class DetailState(
    val success: Detail? = null,
    val error: String? = null
)