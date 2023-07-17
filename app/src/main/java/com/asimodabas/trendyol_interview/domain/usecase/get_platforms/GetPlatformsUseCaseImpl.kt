package com.asimodabas.trendyol_interview.domain.usecase.get_platforms

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.safeApiRequest
import com.asimodabas.trendyol_interview.domain.mapper.platform.PlatformMapper
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import javax.inject.Inject

class GetPlatformsUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository,
    private val platformMapper: PlatformMapper
) : GetPlatformsUseCase {
    override suspend fun invoke(): NetworkCheck<List<PlatformUiModel>> = safeApiRequest {
        platformMapper.map(gameRepository.getGamePlatforms())
    }
}