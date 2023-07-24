package com.asimodabas.data.usecase.get_platforms

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.ui_model.PlatformUiModel

interface GetPlatformsUseCase {
    suspend operator fun invoke(): NetworkCheck<List<PlatformUiModel>?>
}