package com.asimodabas.data.delete_detail

import com.asimodabas.data.repository.GameDetailRoomRepository
import com.asimodabas.data.topDetailLocal
import com.asimodabas.data.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.data.usecase.delete_detail.DeleteDetailUseCaseImpl
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
    fun `given deleteDetail operation when deleteDetail in use case is called then verify repository method is called`() =
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