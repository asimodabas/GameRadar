package com.asimodabas.data.repository

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.model.Detail

interface GameDetailRepository {
    suspend fun getGameDetail(id: Int): NetworkCheck<Detail>
}
