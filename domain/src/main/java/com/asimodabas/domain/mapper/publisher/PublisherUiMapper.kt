package com.asimodabas.domain.mapper.publisher

import com.asimodabas.data.model.Publisher
import com.asimodabas.domain.ui_model.PublisherUiModel

interface PublisherUiMapper {
    fun map(input: Publisher): PublisherUiModel
}