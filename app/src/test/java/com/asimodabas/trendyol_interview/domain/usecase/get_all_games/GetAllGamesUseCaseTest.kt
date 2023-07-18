package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.assertNetworkCheckEquals
import com.asimodabas.trendyol_interview.common.topGameDTO
import com.asimodabas.trendyol_interview.common.topGameUiModelList
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class GetAllGamesUseCaseTest {

    private lateinit var getAllGamesUseCase: GetAllGamesUseCase

    @Mock
    private lateinit var gameRepository: GameRepository

    @Mock
    private lateinit var gameMapper: GameMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getAllGamesUseCase = GetAllGamesUseCaseImpl(gameRepository, gameMapper)
    }

    @Test
    fun `should return NetworkCheck Success with a list of GameUiModel`() = runBlocking {
        // Given
        val gameEntities = topGameDTO
        val gameUiModels = topGameUiModelList

        // Mock repository response
        Mockito.`when`(gameRepository.getAllGames()).thenReturn(gameEntities)

        // Mock mapper response
        Mockito.`when`(gameMapper.map(gameEntities)).thenReturn(gameUiModels)

        // When
        val result = getAllGamesUseCase()

        // Then
        val expected = NetworkCheck.Success(gameUiModels)
        assertNetworkCheckEquals(expected, result)
    }
}