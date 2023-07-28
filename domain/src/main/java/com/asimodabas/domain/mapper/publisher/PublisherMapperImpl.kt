package com.asimodabas.domain.mapper.publisher

import com.asimodabas.data.model.Publisher
import com.asimodabas.domain.ui_model.PublisherUiModel
import javax.inject.Inject

class PublisherMapperImpl @Inject constructor() : PublisherMapper {
    override fun map(input: PublisherUiModel): Publisher =
        Publisher(
            id = input.id,
            name = input.name,
            imageBackground = input.imageBackground
        )
}