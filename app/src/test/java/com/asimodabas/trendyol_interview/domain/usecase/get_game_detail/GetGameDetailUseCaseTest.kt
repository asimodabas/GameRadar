package com.asimodabas.trendyol_interview.domain.usecase.get_game_detail

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.createDetailShow
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
    fun `should return NetworkCheck Success with Detail data`() = runBlocking {
        // Given - Mocked data
        val mockedId = 1
        val mockedDetail = createDetailShow()

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