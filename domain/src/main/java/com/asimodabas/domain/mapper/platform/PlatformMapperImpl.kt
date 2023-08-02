package com.asimodabas.domain.mapper.platform

import com.asimodabas.data.dto.PlatformDTO
import com.asimodabas.domain.ui_model.PlatformUiModel
import javax.inject.Inject

class PlatformMapperImpl @Inject constructor(): PlatformMapper {
    override fun map(input: PlatformDTO): List<PlatformUiModel> {
        return input.results.map {
            PlatformUiModel(
                id = it.id,
                name = it.name,
                slug = it.slug
            )
        }
    }
}