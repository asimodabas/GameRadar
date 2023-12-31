package com.asimodabas.domain.usecase.get_platforms

import com.asimodabas.data.repository.game.GameRepository
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.mapper.platform.PlatformMapper
import com.asimodabas.domain.common.safeApiRequest
import com.asimodabas.domain.ui_model.PlatformUiModel
import javax.inject.Inject

class GetPlatformsUseCaseImpl @Inject constructor(
    private val gameRepository: GameRepository,
    private val platformMapper: PlatformMapper
) : GetPlatformsUseCase {
    override suspend fun invoke(): NetworkCheck<List<PlatformUiModel>?> =
        safeApiRequest {
            platformMapper.map(gameRepository.getGamePlatforms())
        }
}