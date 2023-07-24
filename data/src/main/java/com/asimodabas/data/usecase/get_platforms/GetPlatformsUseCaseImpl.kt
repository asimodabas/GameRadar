package com.asimodabas.data.usecase.get_platforms

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.common.safeApiRequest
import com.asimodabas.data.data.mapper.platform.PlatformMapper
import com.asimodabas.domain.ui_model.PlatformUiModel
import com.asimodabas.data.data.repository.GameRepository
import javax.inject.Inject

class GetPlatformsUseCaseImpl @Inject constructor(
    private val gameRepository:  GameRepository,
    private val platformMapper:  PlatformMapper
) : GetPlatformsUseCase {
    override suspend fun invoke(): NetworkCheck<List<PlatformUiModel>?> =
        safeApiRequest {
            platformMapper.map(gameRepository.getGamePlatforms())
        }
}