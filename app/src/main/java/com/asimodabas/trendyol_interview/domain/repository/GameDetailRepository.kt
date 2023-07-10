package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.Detail

interface GameDetailRepository {
    suspend fun getGameDetail(id: Int): NetworkCheck<Detail>
}
