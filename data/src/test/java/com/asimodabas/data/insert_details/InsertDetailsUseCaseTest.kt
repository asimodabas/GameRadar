    package com.asimodabas.data.insert_details

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.data.topDetailLocal
import com.asimodabas.data.usecase.insert_details.InsertDetailsUseCaseImpl
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
    fun `given a repository, when the insertDetail function is called with a detail then the detail should be inserted into the repository`() =
        runBlocking {
            // Given - Mocked data
            val detail = topDetailLocal

            // When - Call the use case
            insertDetailsUseCase(detail)

            // Then - Verify that the insertDetail function of the repository is called with the correct parameter
            Mockito.verify(gameDetailRoomRepository).insertDetail(detail)
        }
}