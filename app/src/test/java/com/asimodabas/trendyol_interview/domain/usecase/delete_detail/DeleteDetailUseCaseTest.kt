package com.asimodabas.trendyol_interview.domain.usecase.delete_detail

import com.asimodabas.trendyol_interview.common.topDetailLocal
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock

class DeleteDetailUseCaseTest {

    private lateinit var deleteDetailUseCase: DeleteDetailUseCase

    @Mock
    private lateinit var gameDetailRoomRepository: GameDetailRoomRepository

    @Before
    fun setUp() {
        gameDetailRoomRepository = mockk()
        deleteDetailUseCase = DeleteDetailUseCaseImpl(gameDetailRoomRepository)
    }

    @Test
    fun `when invoke is called with a detail, it should call deleteDetail in repository`() =
        runBlocking {
            // Given
            val detail = topDetailLocal
            coEvery { gameDetailRoomRepository.deleteDetail(detail) } returns Unit

            // When
            deleteDetailUseCase.invoke(detail)

            // Then
            coVerify(exactly = 1) { gameDetailRoomRepository.deleteDetail(detail) }
        }
}