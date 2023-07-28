package com.asimodabas.domain.use_case.delete_detail

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.firstDetailShow
import com.asimodabas.domain.firstDetailUiShow
import com.asimodabas.domain.mapper.detail.DetailMapper
import com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCaseImpl
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class DeleteDetailUseCaseTest {

    private lateinit var deleteDetailUseCase: DeleteDetailUseCase

    @Mock
    private lateinit var gameDetailRoomRepository: GameDetailRoomRepository

    @Mock
    private lateinit var detailMapper: DetailMapper

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        deleteDetailUseCase = DeleteDetailUseCaseImpl(gameDetailRoomRepository, detailMapper)
    }

    @Test
    fun `given deleteDetail operation when deleteDetail in use case is called then verify repository method is called`() =
        runBlocking {
            // Given
            val detailUiModel = firstDetailUiShow()
            val detailModel = firstDetailShow()

            // Mock the mapper function to map DetailUiModel to Detail
            Mockito.`when`(detailMapper.map(detailUiModel)).thenReturn(detailModel)

            // When
            deleteDetailUseCase.invoke(detailUiModel)

            // Then - Verify that the repository method is called with the correct parameter
            Mockito.verify(gameDetailRoomRepository, Mockito.times(1)).deleteDetail(detailModel)
        }
}