package com.asimodabas.presentation.games

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.paging.PagingData
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase
import com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase
import com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase
import com.asimodabas.presentation.firstPlatformUiModel
import com.asimodabas.presentation.fragment.games.GamesViewModel
import com.asimodabas.presentation.observedValue
import com.asimodabas.presentation.secondPlatformUiModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
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
    private lateinit var getGameSearchPagerUseCase: GetGameSearchPagerUseCase

    @Mock
    private lateinit var getAllGamesPagerUseCase: GetAllGamesPagerUseCase

    @Mock
    private lateinit var getGameSearchUseCase: GetGameSearchUseCase

    @Mock
    private lateinit var getPlatformsUseCase: GetPlatformsUseCase

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)

        // Set the "Main" dispatcher
        Dispatchers.setMain(testDispatcher)

        viewModel = GamesViewModel(
            getAllGamesPagerUseCase,
            getGameSearchPagerUseCase,
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
    fun `Given get allGames pager useCase When getGames called Then verify games Loaded`() =
        runTest {
            // Given
            `when`(getAllGamesPagerUseCase.invoke()).thenReturn(null)

            // When
            viewModel.getGames()

            // Then
            val gameState = viewModel.gameState.observedValue()
            assertNull(gameState?.success)
        }

    @Test
    fun `Given get platforms useCase When getPlatforms called Then verify platforms Loaded`() =
        runTest {
            // Given
            val mockedPlatforms = listOf(firstPlatformUiModel, secondPlatformUiModel)
            `when`(getPlatformsUseCase.invoke()).thenReturn(NetworkCheck.Success(mockedPlatforms))

            // When
            viewModel.getPlatforms()

            // Then - The platform data should be retrieved successfully
            val platformItemViewState = viewModel.platformItemViewState.observedValue()
            assertNotNull(platformItemViewState)
            assertEquals(2, platformItemViewState?.size)
            assertEquals("firstTestName", platformItemViewState?.get(0)?.uiModel?.name)
            assertEquals("secondTestName", platformItemViewState?.get(1)?.uiModel?.name)
        }

    @Test
    fun `Given NetworkError When getGames called Then verify Error state updated`() =
        runTest {
            // Given
            val errorMessage = "Network Error"
            val errorResponse =
                NetworkCheck.Error<PagingData<GameUiModel>>(
                    message = errorMessage,
                    networkError = true
                )
            val errorFlow: Flow<NetworkCheck<PagingData<GameUiModel>>> = flow {
                emit(errorResponse)
            }

            `when`(getAllGamesPagerUseCase.invoke()).thenReturn(errorFlow as Flow<PagingData<GameUiModel>>)

            // When
            viewModel.getGames()

            // Then
            val gameState = viewModel.gameState.observedValue()

            assertNull(gameState?.success)
        }
}