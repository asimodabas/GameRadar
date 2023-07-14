package com.asimodabas.trendyol_interview.domain.usecase.get_platforms

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

interface GetPlatformsUseCase  {
    suspend operator fun invoke():  NetworkCheck<List<PlatformUiModel>>
}