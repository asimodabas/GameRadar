package com.asimodabas.trendyol_interview.domain.usecase.get_all_games

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.mergeGameUiModel
import com.asimodabas.trendyol_interview.common.topGameDTO
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
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
            assert(result is NetworkCheck.Success)
            assertEquals(mockGameUiList, (result as NetworkCheck.Success).data)
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
            assert(result is NetworkCheck.Error)
            assertEquals("Network Error", (result as NetworkCheck.Error).message)
        }
    }
}