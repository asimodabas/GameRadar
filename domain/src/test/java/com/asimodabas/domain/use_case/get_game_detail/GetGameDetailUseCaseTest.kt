package com.asimodabas.domain.use_case.get_game_detail

import com.asimodabas.data.repository.game_detail.GameDetailRepository
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.firstDetailShow
import com.asimodabas.domain.firstDetailUiShow
import com.asimodabas.domain.mapper.detail.DetailUiMapper
import com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCaseImpl
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
    private lateinit var gameDetailRepository: GameDetailRepository

    @Mock
    private lateinit var detailUiMapper: DetailUiMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getGameDetailUseCase = GetGameDetailUseCaseImpl(gameDetailRepository, detailUiMapper)
    }

    @Test
    fun `given NetworkCheck when request succeeds then Success is triggered`() = runBlocking {
        // Given - Mocked data
        val mockedId = 1
        val mockedDetail = firstDetailShow()
        val expectedDetailUiModel = firstDetailUiShow()

        // Mock the repository function to return the mocked data
        Mockito.`when`(gameDetailRepository.getGameDetail(mockedId))
            .thenReturn(mockedDetail)

        // Mock the mapper function to map Detail to DetailUiModel
        Mockito.`when`(detailUiMapper.map(mockedDetail)).thenReturn(expectedDetailUiModel)

        // When
        val result = getGameDetailUseCase(mockedId)

        // Then - Assert that the result is NetworkCheck.Success with the mocked data
        assertTrue(result is NetworkCheck.Success)
        assertEquals(
            expectedDetailUiModel,
            (result as NetworkCheck.Success).data
        )
    }
}