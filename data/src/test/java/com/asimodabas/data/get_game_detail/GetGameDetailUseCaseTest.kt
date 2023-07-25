package com.asimodabas.data.get_game_detail

import com.asimodabas.data.firstDetailShow
import com.asimodabas.data.repository.GameDetailRepository
import com.asimodabas.data.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.data.usecase.get_game_detail.GetGameDetailUseCaseImpl
import com.asimodabas.domain.common.NetworkCheck
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
        assertEquals(
            mockedDetail,
            (result as NetworkCheck.Success).data
        )
    }
}