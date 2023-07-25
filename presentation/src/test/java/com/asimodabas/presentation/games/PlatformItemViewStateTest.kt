package com.asimodabas.presentation.games

import com.asimodabas.presentation.R
import com.asimodabas.presentation.firstPlatformUiModel
import com.asimodabas.presentation.fragment.games.view.PlatformItemViewState
import com.asimodabas.presentation.secondPlatformUiModel
import org.junit.Assert.assertEquals
import org.junit.Test

class PlatformItemViewStateTest {

    @Test
    fun `Given platform withUiModel When getPlatform nameCalled Then verify platform name Returned`() {
        // Given
        val platformUiModel = firstPlatformUiModel
        val platformItemViewState = PlatformItemViewState(uiModel = platformUiModel)

        // When
        val platformName = platformItemViewState.getPlatformName()

        // Then
        assertEquals("firstTestName", platformName)
    }

    @Test
    fun `Given platform with selection When updateBackground called Then verify background Updated`() {
        // Given
        val selectedPlatformUiModel = firstPlatformUiModel
        val unselectedPlatformUiModel = secondPlatformUiModel
        val selectedPlatformItemViewState = PlatformItemViewState(uiModel = selectedPlatformUiModel)
        val unselectedPlatformItemViewState =
            PlatformItemViewState(uiModel = unselectedPlatformUiModel)

        // When
        val selectedPlatformBackground = selectedPlatformItemViewState.updatePlatformBackground()
        val unselectedPlatformBackground =
            unselectedPlatformItemViewState.updatePlatformBackground()

        // Then
        assertEquals(R.drawable.bg_custom_platform_shape_select, selectedPlatformBackground)
        assertEquals(R.drawable.bg_custom_platform_shape, unselectedPlatformBackground)
    }

    @Test
    fun `Given not selectedPlatform When updateBackground called Then verify background Updated`() {
        // Given
        val platformUiModel = firstPlatformUiModel
        val viewState = PlatformItemViewState(uiModel = platformUiModel)

        // When
        val result = viewState.updatePlatformBackground()

        // Then
        assertEquals(R.drawable.bg_custom_platform_shape, result)
    }


    @Test
    fun `Given selectedPlatform When updateBackground called Then verify background Updated`() {
        // Given
        val platformUiModel = firstPlatformUiModel
        val viewState = PlatformItemViewState(uiModel = platformUiModel)

        // When
        val result = viewState.updatePlatformBackground()

        // Then
        assertEquals(R.drawable.bg_custom_platform_shape_select, result)
    }
}