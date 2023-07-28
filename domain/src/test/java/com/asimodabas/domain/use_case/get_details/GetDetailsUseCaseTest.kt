package com.asimodabas.domain.use_case.get_details

import com.asimodabas.data.model.Detail
import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.firstDetailShow
import com.asimodabas.domain.firstDetailUiShow
import com.asimodabas.domain.mapper.game_detail.GameDetailMapper
import com.asimodabas.domain.usecase.get_details.GetDetailsUseCase
import com.asimodabas.domain.usecase.get_details.GetDetailsUseCaseImpl
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class GetDetailsUseCaseTest {

    private lateinit var getDetailsUseCase: GetDetailsUseCase

    @Mock
    private lateinit var gameDetailRoomRepository: GameDetailRoomRepository

    @Mock
    private lateinit var gameDetailMapper: GameDetailMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getDetailsUseCase = GetDetailsUseCaseImpl(gameDetailRoomRepository, gameDetailMapper)
    }

    @Test
    fun `given GetDetailsUseCase, when GetDetailsUseCase is called then it should return a list of DetailUiModel`() =
        runBlocking {
            // Given - Mocked data
            val detailList = listOf(firstDetailShow())
            val detailUiModelList = listOf(firstDetailUiShow())

            // Mock the repository function to return the mocked data
            Mockito.`when`(gameDetailRoomRepository.getDetails()).thenReturn(detailList)

            // Mock the mapper function to map Detail to DetailUiModel
            Mockito.`when`(gameDetailMapper.map(detailList)).thenReturn(detailUiModelList)

            // When
            val result = getDetailsUseCase()

            // Then - Assert that the result matches the mocked data
            assertEquals(detailUiModelList, result)
        }

    @Test
    fun `given an empty list returned from the repository when the use case is called, then it should return an empty list`() =
        runBlocking {
            // Given - Mocked data
            val emptyList = emptyList<Detail>()

            // Mock the repository function to return an empty list
            Mockito.`when`(gameDetailRoomRepository.getDetails()).thenReturn(emptyList)

            // When
            val result = getDetailsUseCase()

            // Then - Assert that the result is an empty list
            assertEquals(emptyList, result)
        }
}