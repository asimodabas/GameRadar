package com.asimodabas.domain.use_case.get_platforms

import com.asimodabas.data.repository.game.GameRepository
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.mapper.platform.PlatformMapper
import com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase
import com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCaseImpl
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class GetPlatformsUseCaseTest {

    private lateinit var getPlatformsUseCase: GetPlatformsUseCase

    @Mock
    private lateinit var gameRepository: GameRepository

    @Mock
    private lateinit var platformMapper: PlatformMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getPlatformsUseCase = GetPlatformsUseCaseImpl(gameRepository, platformMapper)
    }

    @Test
    fun `given the repository throwing an exception, when the use case is called, then it should return a NetworkCheck Error`() =
        runBlocking {
            // Given - Mocked error message
            val errorMessage = "Error fetching platforms."

            // Mock the repository function to throw an exception
            `when`(gameRepository.getGamePlatforms()).thenThrow(RuntimeException(errorMessage))

            // When
            val result = getPlatformsUseCase()

            // Then - Assert that the result is NetworkCheck.Error with the correct error message
            assertTrue(result is NetworkCheck.Error)
            assertEquals(errorMessage, (result as NetworkCheck.Error).message)
        }
}