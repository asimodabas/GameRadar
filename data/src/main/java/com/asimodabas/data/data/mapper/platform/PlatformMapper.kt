package com.asimodabas.data.data.mapper.platform

import com.asimodabas.data.data.dto.PlatformDTO
import com.asimodabas.domain.ui_model.PlatformUiModel

interface PlatformMapper {
    fun map(input: PlatformDTO) : List<PlatformUiModel>
}