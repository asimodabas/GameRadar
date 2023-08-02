package com.asimodabas.domain.use_case.insert_details

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.domain.firstDetailShow
import com.asimodabas.domain.firstDetailUiShow
import com.asimodabas.domain.mapper.detail.DetailMapper
import com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase
import com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCaseImpl
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class InsertDetailsUseCaseTest {

    private lateinit var insertDetailsUseCase: InsertDetailsUseCase

    @Mock
    private lateinit var gameDetailRoomRepository: GameDetailRoomRepository

    @Mock
    private lateinit var detailMapper: DetailMapper

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        insertDetailsUseCase = InsertDetailsUseCaseImpl(gameDetailRoomRepository, detailMapper)
    }

    @Test
    fun `given a detail, when the use case is invoked then the detail should be inserted into the repository`() =
        runBlocking {
            // Given - Mocked data
            val detailUiModel = firstDetailUiShow()
            val detailEntity = firstDetailShow()

            // Mock the behavior of detailMapper
            Mockito.`when`(detailMapper.map(detailUiModel)).thenReturn(detailEntity)

            // When - Call the use case
            insertDetailsUseCase(detailUiModel)

            // Then - Verify that the insertDetail function of the repository is called with the correct parameter
            Mockito.verify(gameDetailRoomRepository).insertDetail(detailEntity)
        }
}