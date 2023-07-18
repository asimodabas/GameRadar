package com.asimodabas.trendyol_interview.domain.usecase.insert_details

import com.asimodabas.trendyol_interview.common.topDetailLocal
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class InsertDetailsUseCaseTest {

    private lateinit var insertDetailsUseCase: InsertDetailsUseCaseImpl

    @Mock
    private lateinit var gameDetailRoomRepository: GameDetailRoomRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        insertDetailsUseCase = InsertDetailsUseCaseImpl(gameDetailRoomRepository)
    }

    @Test
    fun `should insert detail to repository`() = runBlocking {
        // Given - Mocked data
        val detail = topDetailLocal

        // When - Call the use case
        insertDetailsUseCase(detail)

        // Then - Verify that the insertDetail function of the repository is called with the correct parameter
        Mockito.verify(gameDetailRoomRepository).insertDetail(detail)
    }
}