package com.asimodabas.domain.mapper.publisher

import com.asimodabas.data.model.Publisher
import com.asimodabas.domain.ui_model.PublisherUiModel
import javax.inject.Inject

class PublisherUiMapperImpl @Inject constructor() : PublisherUiMapper {
    override fun map(input: Publisher): PublisherUiModel =
        PublisherUiModel(
            id = input.id,
            name = input.name,
            imageBackground = input.imageBackground
        )
}