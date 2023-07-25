package com.asimodabas.presentation.games_detail

import android.content.SharedPreferences
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.asimodabas.data.mapper.detail_local.DetailLocalMapper
import com.asimodabas.data.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.data.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.data.usecase.insert_details.InsertDetailsUseCase
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.presentation.firstDetailShow
import com.asimodabas.presentation.fragment.games_detail.GamesDetailViewModel
import com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState
import com.asimodabas.presentation.observedValue
import com.asimodabas.presentation.topDetailLocal
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
import org.mockito.ArgumentMatchers.anyBoolean
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

@ExperimentalCoroutinesApi
class GamesDetailViewModelTest {

    private lateinit var viewModel: GamesDetailViewModel

    @Mock
    private lateinit var getGameDetailUseCase: GetGameDetailUseCase

    @Mock
    private lateinit var insertDetailsUseCase: InsertDetailsUseCase

    @Mock
    private lateinit var deleteDetailUseCase: DeleteDetailUseCase

    @Mock
    private lateinit var detailLocalMapper: DetailLocalMapper

    @Mock
    private lateinit var sharedPreferences: SharedPreferences

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)

        // Set the "Main" dispatcher
        Dispatchers.setMain(testDispatcher)

        viewModel = GamesDetailViewModel(
            getGameDetailUseCase,
            insertDetailsUseCase,
            deleteDetailUseCase,
            detailLocalMapper,
            sharedPreferences
        )
    }

    @After
    fun cleanup() {
        // Clear the "main" dispatcher
        Dispatchers.resetMain()
    }

    @Test
    fun `Given database with availableDetails When getDetail called with itemId Then verify details retrieved Success()`() =
        runTest {
            // Mock data and response
            val id = 123
            val detail = firstDetailShow()
            val response = NetworkCheck.Success(detail)

            // Set up the mock behavior for the use case
            `when`(getGameDetailUseCase.invoke(id)).thenReturn(response)

            // Call the function to be tested
            viewModel.getDetail(id)

            // Wait until LiveData is updated
            val expectedResult = GamesDetailViewState(data = detail)
            val result = viewModel.gamesDetailViewState.observedValue()
            assertEquals(expectedResult, result)
        }

    @Test
    fun `Given user with wishlist containing item When check wishlist calledForItem Then verifyItReturns True`() =
        runTest {
            // Mock data and response
            val detail = firstDetailShow()

            // Mock behavior for sharedPreferences
            `when`(sharedPreferences.getBoolean(anyString(), anyBoolean())).thenReturn(true)

            // Call the function to be tested
            viewModel.checkWishlist(detail)

            // Wait until LiveData is updated
            val expectedResult = true
            val result = viewModel.wishlistState.observedValue()
            assertEquals(expectedResult, result)
        }

    @Test
    fun `Given user without specified item When check wishlist called for item Then verify it returns False`() =
        runTest {
            // Mock data and response
            val detail = firstDetailShow()

            // Mock behavior for sharedPreferences
            `when`(
                sharedPreferences.getBoolean(
                    anyString(), anyBoolean()
                )
            ).thenReturn(false) // Different from testCheckWishlistTrue

            // Call the function to be tested
            viewModel.checkWishlist(detail)

            // Wait until LiveData is updated
            val expectedResult = false // Different from testCheckWishlistTrue
            val result = viewModel.wishlistState.observedValue()
            assertEquals(expectedResult, result)
        }

    @Test
    fun `Given user with wishlist containing multiple items When check wishlist called for item Then verify presence item in wishlist`() =
        runTest {
            // Mock data and response
            val detail = firstDetailShow()

            // Mock behavior for sharedPreferences
            `when`(sharedPreferences.getBoolean(anyString(), anyBoolean())).thenReturn(true)

            // Call the function to be tested
            viewModel.checkWishlist(detail)

            // Wait until LiveData is updated
            val expectedResult = true
            val result = viewModel.wishlistState.observedValue()
            assertEquals(expectedResult, result)
        }

    @Test
    fun `Given user wishlist page When click wishlist button for item Then verify item added to cart Success`() =
        runTest {
            // Mock data and response
            val detail = firstDetailShow()
            val detailLocal = topDetailLocal

            // Mock behavior for sharedPreferences
            `when`(sharedPreferences.getBoolean(anyString(), anyBoolean())).thenReturn(true)

            // Mock behavior for detailLocalMapper
            `when`(detailLocalMapper.map(detail)).thenReturn(detailLocal)

            // Call the function to be tested
            viewModel.wishlistClickButton(detail)

            // Wait until LiveData is updated
            val expectedResult = false
            val result = viewModel.wishlistState.observedValue()
            assertEquals(expectedResult, result)
        }
}