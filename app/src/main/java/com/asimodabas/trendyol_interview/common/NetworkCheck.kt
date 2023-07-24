package com.asimodabas.trendyol_interview.common

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

sealed class NetworkCheck<T>(
    val data: T? = null,
    val message: String? = null,
    val networkError: Boolean? = false
) {
    class Success<T>(data: T) : NetworkCheck<T>(data)
    class Error<T>(message: String?, networkError: Boolean) : NetworkCheck<T>(
        data = null,
        message = message,
        networkError = networkError
    )
}

suspend fun <T> safeApiRequest(apiRequest: suspend () -> T): NetworkCheck<T> {
    return withContext(Dispatchers.IO) {
        try {
            NetworkCheck.Success(apiRequest.invoke())
        } catch (throwable: Throwable) {
            NetworkCheck.Error(
                message = throwable.localizedMessage,
                networkError = true
            )
        }
    }
}