package com.asimodabas.trendyol_interview.domain.usecase.get_details

import com.asimodabas.trendyol_interview.common.mergeWishlistUiModel
import com.asimodabas.trendyol_interview.domain.model.ui_model.WishlistUiModel
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
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
    fun `should return list of WishlistUiModel`() = runBlocking {
        // Mock the repository function to return the mocked data
        Mockito.`when`(gameDetailRoomRepository.getDetails()).thenReturn(mergeWishlistUiModel)

        // When
        val result = getDetailsUseCase()

        // Then - Assert that the result matches the mocked data
        assertEquals(mergeWishlistUiModel, result)
    }

    @Test
    fun `should return empty list when repository returns empty list`() = runBlocking {
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