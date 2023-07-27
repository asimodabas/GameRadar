package com.asimodabas.data.get_details

import com.asimodabas.data.mergeWishlistUiModel
import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.data.usecase.get_details.GetDetailsUseCase
import com.asimodabas.data.usecase.get_details.GetDetailsUseCaseImpl
import com.asimodabas.domain.ui_model.WishlistUiModel
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
    lateinit var gameDetailRoomRepository: GameDetailRoomRepository

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getDetailsUseCase = GetDetailsUseCaseImpl(gameDetailRoomRepository)
    }

    @Test
    fun `given WishlistUseCase, when WishlistUseCase is called then it should return WishlistUiModel list`() =
        runBlocking {
            // Mock the repository function to return the mocked data
            Mockito.`when`(gameDetailRoomRepository.getDetails()).thenReturn(mergeWishlistUiModel)

            // When
            val result = getDetailsUseCase()

            // Then - Assert that the result matches the mocked data
            assertEquals(mergeWishlistUiModel, result)
        }

    @Test
    fun `given an empty list returned from the repository when the use case is called, then it should return an empty list`() =
        runBlocking {
            // Given - Mocked data
            val emptyList = emptyList<WishlistUiModel>()

            // Mock the repository function to return an empty list
            Mockito.`when`(gameDetailRoomRepository.getDetails()).thenReturn(emptyList)

            // When
            val result = getDetailsUseCase()

            // Then - Assert that the result is an empty list
            assertEquals(emptyList, result)
        }
}