package com.asimodabas.domain.use_case.get_all_games

import com.asimodabas.data.repository.game.GameRepository
import com.asimodabas.domain.mapper.game.GameMapper
import com.asimodabas.domain.mergeGameUiModel
import com.asimodabas.domain.topGameDTO
import com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCaseImpl
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class GetAllGamesUseCaseTest {

    private lateinit var getAllGamesUseCase: GetAllGamesUseCase

    @Mock
    private lateinit var mockGameRepository: GameRepository

    @Mock
    private lateinit var mockGameMapper: GameMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getAllGamesUseCase = GetAllGamesUseCaseImpl(mockGameRepository, mockGameMapper)
    }

    @Test
    fun `given GetAllGamesUseCase when getAllGamesUseCase is called then it should return NetworkCheck Success with GameUiModel list`() {
        runBlocking {
            // Create mock data
            val mockGameList = topGameDTO
            val mockGameUiList = mergeGameUiModel

            // Define the behavior of the mock GameRepository
            `when`(mockGameRepository.getAllGames("1")).thenReturn(mockGameList)

            // Define the behavior of the mock GameMapper
            `when`(mockGameMapper.map(mockGameList)).thenReturn(mockGameUiList)

            // Call the Use Case
            val result = getAllGamesUseCase("1")

            // Check the result
            assert(result is com.asimodabas.domain.common.NetworkCheck.Success)
            assertEquals(
                mockGameUiList,
                (result as com.asimodabas.domain.common.NetworkCheck.Success).data
            )
        }
    }

    @Test
    fun `given GetAllGamesUseCase, when getAllGamesUseCase throws an exception then it should return NetworkCheck Error`() {
        runBlocking {
            // Define the behavior of the mock GameRepository and throw an exception
            `when`(mockGameRepository.getAllGames("1")).thenThrow(RuntimeException("Network Error"))

            // Call the Use Case
            val result = getAllGamesUseCase("1")

            // Check the result
            assert(result is com.asimodabas.domain.common.NetworkCheck.Error)
            assertEquals("Network Error", (result as com.asimodabas.domain.common.NetworkCheck.Error).message)
        }
    }
}