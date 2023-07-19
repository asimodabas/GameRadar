package com.asimodabas.trendyol_interview.domain.usecase.get_game_detail

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.firstDetailShow
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class GetGameDetailUseCaseTest {

    private lateinit var getGameDetailUseCase: GetGameDetailUseCase

    @Mock
    lateinit var gameDetailRepository: GameDetailRepository

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getGameDetailUseCase = GetGameDetailUseCaseImpl(gameDetailRepository)
    }

    @Test
    fun `given NetworkCheck when request succeeds then Success is triggered`() = runBlocking {
        // Given - Mocked data
        val mockedId = 1
        val mockedDetail = firstDetailShow()

        // Mock the repository function to return the mocked data
        Mockito.`when`(gameDetailRepository.getGameDetail(mockedId))
            .thenReturn(NetworkCheck.Success(mockedDetail))

        // When
        val result = getGameDetailUseCase(mockedId)

        // Then - Assert that the result is NetworkCheck.Success with the mocked data
        assertTrue(result is NetworkCheck.Success)
        assertEquals(mockedDetail, (result as NetworkCheck.Success).data)
    }
}