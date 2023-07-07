package com.asimodabas.trendyol_interview.domain.repository

import com.asimodabas.trendyol_interview.common.NetworkCheck
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class BaseRepository {
    suspend fun <T> safeApiRequest(
        apiRequest: suspend () -> T
    ): NetworkCheck<T> {
        return withContext(Dispatchers.IO) {
            try {
                NetworkCheck.Success(apiRequest.invoke())
            } catch (throwable: Throwable) {
                NetworkCheck.Error(throwable.localizedMessage, true)
            }
        }
    }
}