package com.asimodabas.trendyol_interview.ui.fragment.games

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.mergePlatformUiModel
import com.asimodabas.trendyol_interview.common.observedValue
import com.asimodabas.trendyol_interview.common.state.GameState
import com.asimodabas.trendyol_interview.common.state.PlatformState
import com.asimodabas.trendyol_interview.common.topGameUiModelList
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_platforms.GetPlatformsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class GamesViewModelTest {

    private lateinit var viewModel: GamesViewModel

    @Mock
    private lateinit var getAllGamesUseCase: GetAllGamesUseCase

    @Mock
    private lateinit var getPlatformsUseCase: GetPlatformsUseCase

    @Mock
    private lateinit var getGameSearchUseCase: GetGameSearchUseCase

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)

        // Set the "Main" dispatcher
        Dispatchers.setMain(testDispatcher)

        viewModel = GamesViewModel(
            getAllGamesUseCase,
            getGameSearchUseCase,
            getPlatformsUseCase
        )
    }

    @After
    fun cleanup() {
        // Clear the "main" dispatcher
        Dispatchers.resetMain()
    }

    @Test
    fun testGetGamesSuccess() = runTest {
        // Mock data and response
        val gameList = topGameUiModelList
        val response = NetworkCheck.Success(gameList)

        // Set up the mock behavior for the use case
        `when`(getAllGamesUseCase.invoke()).thenReturn(response)

        // Call the function to be tested
        viewModel.getGames()

        // Wait until LiveData is updated
        val expectedResult = GameState(success = gameList)
        val result = viewModel.gameState.observedValue()
        assertEquals(expectedResult, result)
    }

    @Test
    fun testGetPlatformsSuccess() = runTest {
        // Mock data and response
        val platformList = mergePlatformUiModel
        val response = NetworkCheck.Success(platformList)

        // Set up the mock behavior for the use case
        `when`(getPlatformsUseCase.invoke()).thenReturn(response)

        // Call the function to be tested
        viewModel.getPlatforms()

        // Wait until LiveData is updated
        val expectedResult = PlatformState(success = platformList)
        val result = viewModel.platformsState.observedValue()
        assertEquals(expectedResult, result)
    }

    @Test
    fun testGetGamesError() = runTest {
        // Mock data and response
        val errorMessage = "Error fetching games"
        val response =
            NetworkCheck.Error<List<GameUiModel>>(message = errorMessage, networkError = true)

        // Set up the mock behavior for the use case
        `when`(getAllGamesUseCase.invoke()).thenReturn(response)

        // Call the function to be tested
        viewModel.getGames()

        // Wait until LiveData is updated
        val expectedResult = GameState(error = errorMessage)
        val result = viewModel.gameState.observedValue()
        assertEquals(expectedResult, result)
    }

    @Test
    fun testGetPlatformsError() = runTest {
        // Mock data and response
        val errorMessage = "Error fetching platforms"
        val response =
            NetworkCheck.Error<List<PlatformUiModel>>(message = errorMessage, networkError = true)

        // Set up the mock behavior for the use case
        `when`(getPlatformsUseCase.invoke()).thenReturn(response)

        // Call the function to be tested
        viewModel.getPlatforms()

        // Wait until LiveData is updated
        val expectedResult = PlatformState(error = errorMessage)
        val result = viewModel.platformsState.observedValue()
        assertEquals(expectedResult, result)
    }

    @Test
    fun testGetSearchGamesError() = runTest {
        // Mock data and response
        val searchQuery = "example_query"
        val errorMessage = "Error fetching search results"
        val response = NetworkCheck.Error<List<GameUiModel>>(
            message = errorMessage, networkError = true
        ) as NetworkCheck<List<GameUiModel>?>

        // Set up the mock behavior for the use case
        `when`(getGameSearchUseCase.invoke(searchQuery)).thenReturn(response)

        // Call the function to be tested
        viewModel.getSearchGames(searchQuery)

        // Wait until LiveData is updated
        val expectedResult = GameState(error = errorMessage)
        val result = viewModel.gameState.observedValue()
        assertEquals(expectedResult, result)
    }
}