package com.asimodabas.domain.mapper.platform

import com.asimodabas.data.dto.PlatformDTO
import com.asimodabas.domain.ui_model.PlatformUiModel

interface PlatformMapper {
    fun map(input: PlatformDTO) : List<PlatformUiModel>
}