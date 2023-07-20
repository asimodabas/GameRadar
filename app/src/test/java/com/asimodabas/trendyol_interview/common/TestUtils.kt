package com.asimodabas.trendyol_interview.common

import androidx.arch.core.executor.ArchTaskExecutor
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.withContext
import org.junit.Assert

fun <T> assertNetworkCheckEquals(expected: NetworkCheck<T>, actual: NetworkCheck<T>) {
    Assert.assertEquals(expected::class, actual::class)
    Assert.assertEquals(expected.data, actual.data)
    Assert.assertEquals(expected.message, actual.message)
    Assert.assertEquals(expected.networkError, actual.networkError)
}

@ExperimentalCoroutinesApi
suspend fun <T> LiveData<T>.observedValue(): T? {
    var value: T? = null
    val observer = { newValue: T -> value = newValue }
    val observerWrapper = Observer<T> { newValue -> observer(newValue) }

    withContext(Dispatchers.Main.immediate) {
        observeForever(observerWrapper)
        ArchTaskExecutor.getInstance().executeOnMainThread { value = getValue() }
        removeObserver(observerWrapper)
    }
    return value
}