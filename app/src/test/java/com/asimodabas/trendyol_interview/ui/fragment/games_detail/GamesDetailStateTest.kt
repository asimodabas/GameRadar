package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.view.View
import com.asimodabas.trendyol_interview.common.createDetailShow
import com.google.common.truth.Truth
import org.junit.Test

class GamesDetailStateTest {

    @Test
    fun `should match tv show name for given tv show`() {

        // Given
        val tvShow = createDetailShow()
        val givenViewState = GamesDetailState(tvShow)

        // When
        val actualResult = givenViewState.getGameNameTextView()

        // Then
        Truth.assertThat(actualResult).isEqualTo("testName")
    }

    @Test
    fun `should match tv show released for given tv show`() {

        // Given
        val tvShow = createDetailShow()
        val givenViewState = GamesDetailState(tvShow)

        // When
        val actualResult = givenViewState.getReleasedTextView()

        // Then
        Truth.assertThat(actualResult).isEqualTo("testReleased")
    }

    @Test
    fun `should match tv show platime for given tv show`() {

        // Given
        val tvShow = createDetailShow()
        val givenViewState = GamesDetailState(tvShow)

        // When
        val actualResult = givenViewState.getPlaytimeTextView()

        // Then
        Truth.assertThat(actualResult).isEqualTo("testPlaytime")
    }

    @Test
    fun `should return VISIBLE when name is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getGameNameIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when released is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getReleasedIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when playtime is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getPlaytimeIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when description is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getDescriptionIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when redditUrl is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getRedditIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when website is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getWebsiteIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when genres is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.genreIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when publisher is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.publisherIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `should return VISIBLE when metacritic is not null or empty`() {
        // Given
        val state = GamesDetailState(createDetailShow())

        // When
        val result = state.getMetacriticIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }
}