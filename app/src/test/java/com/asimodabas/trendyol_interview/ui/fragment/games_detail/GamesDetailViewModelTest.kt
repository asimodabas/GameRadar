package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.content.SharedPreferences
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.createDetailShow
import com.asimodabas.trendyol_interview.common.observedValue
import com.asimodabas.trendyol_interview.common.topDetailLocal
import com.asimodabas.trendyol_interview.domain.mapper.detail_local.DetailLocalMapper
import com.asimodabas.trendyol_interview.domain.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.trendyol_interview.domain.usecase.insert_details.InsertDetailsUseCase
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
    fun testGetDetailSuccess() = runTest {
        // Mock data and response
        val id = 123
        val detail = createDetailShow()
        val response = NetworkCheck.Success(detail)

        // Set up the mock behavior for the use case
        `when`(getGameDetailUseCase.invoke(id)).thenReturn(response)

        // Call the function to be tested
        viewModel.getDetail(id)

        // Wait until LiveData is updated
        val expectedResult = GamesDetailState(data = detail)
        val result = viewModel.gamesDetailState.observedValue()
        assertEquals(expectedResult, result)
    }

    @Test
    fun testCheckWishlistTrue() = runTest {
        // Mock data and response
        val detail = createDetailShow()

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
    fun testCheckWishlistFalse() = runTest {
        // Mock data and response
        val detail = createDetailShow()

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
    fun testCheckWishlist() = runTest {
        // Mock data and response
        val detail = createDetailShow()

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
    fun testWishlistClickButton() = runTest {
        // Mock data and response
        val detail = createDetailShow()
        val detailLocal = topDetailLocal // Mock DetailLocal instance

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