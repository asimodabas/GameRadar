package com.asimodabas.trendyol_interview.domain.mapper.platform

import com.asimodabas.trendyol_interview.data.dto.PlatformDTO
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

interface PlatformMapper {
    fun map(input: PlatformDTO) : List<PlatformUiModel>
}