package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class GetGameSearchUseCaseTest {

    private lateinit var getGameSearchUseCase: GetGameSearchUseCase

    @Mock
    private lateinit var gameRepository: GameRepository

    @Mock
    private lateinit var gameMapper: GameMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getGameSearchUseCase = GetGameSearchUseCaseImpl(gameRepository, gameMapper)
    }

    @Test
    fun `should return NetworkCheck Error with error message when repository returns error`() =
        runBlocking {
            // Given - Mocked data
            val query = "rpg"
            val errorMessage = "Error fetching game search results."

            // Mock the repository function to return an error
            Mockito.`when`(gameRepository.getGameSearch(query))
                .thenThrow(RuntimeException(errorMessage))

            // When
            val result = getGameSearchUseCase(query)

            // Then - Assert that the result is NetworkCheck.Error with the correct error message
            assertTrue(result is NetworkCheck.Error)
            assertEquals(errorMessage, (result as NetworkCheck.Error).message)
        }
}