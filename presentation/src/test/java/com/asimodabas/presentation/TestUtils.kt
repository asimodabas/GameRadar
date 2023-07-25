package com.asimodabas.presentation

import androidx.arch.core.executor.ArchTaskExecutor
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.withContext

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