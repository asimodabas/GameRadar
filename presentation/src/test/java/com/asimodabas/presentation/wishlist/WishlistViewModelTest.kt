package com.asimodabas.presentation.wishlist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.asimodabas.domain.state.WishlistState
import com.asimodabas.domain.usecase.get_details.GetDetailsUseCase
import com.asimodabas.presentation.fragment.wishlist.WishlistViewModel
import com.asimodabas.presentation.mergeDetailUiModel
import com.asimodabas.presentation.observedValue
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
class WishlistViewModelTest {

    private lateinit var viewModel: WishlistViewModel

    @Mock
    private lateinit var getDetailsUseCase: GetDetailsUseCase

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)

        // Set the "Main" dispatcher
        Dispatchers.setMain(testDispatcher)

        viewModel = WishlistViewModel(getDetailsUseCase)
    }

    @After
    fun cleanup() {
        // Clear the "main" dispatcher
        Dispatchers.resetMain()
    }

    @Test
    fun `given a user with a wishlist containing multiple items, when the GetWishlist function is called, then ensure that all items in the wishlist are retrieved success`() =
        runTest {
            val wishlistItems = mergeDetailUiModel

            // Set up the mock behavior for the use case
            `when`(getDetailsUseCase.invoke()).thenReturn(wishlistItems)

            // Call the function to be tested
            viewModel.getWishlist()

            // Wait until LiveData is updated
            val expectedResult =
                WishlistState(success = wishlistItems)
            val result = viewModel.wishlistState.observedValue()
            assertEquals(expectedResult, result)
        }
}