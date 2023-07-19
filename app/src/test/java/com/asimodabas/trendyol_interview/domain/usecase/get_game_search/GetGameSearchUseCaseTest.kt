package com.asimodabas.trendyol_interview.domain.usecase.get_game_search

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class GetGameSearchUseCaseTest {

    private lateinit var getGameSearchUseCase: GetGameSearchUseCase

    @Mock
    private lateinit var gameRepository: GameRepository

    @Mock
    private lateinit var gameMapper: GameMapper

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        getGameSearchUseCase = GetGameSearchUseCaseImpl(gameRepository, gameMapper)
    }
}