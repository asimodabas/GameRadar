package com.asimodabas.presentation.games_detail

import android.view.View
import com.asimodabas.presentation.firstDetailUiModel
import com.asimodabas.presentation.formatMetacritic
import com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState
import com.asimodabas.presentation.secondDetailUiModel
import com.google.common.truth.Truth
import org.junit.Assert.assertEquals
import org.junit.Test

class GamesDetailViewStateTest {

    @Test
    fun `Given tvShow When tvShowName checked Then TvShowName should match Given tvShowName`() {

        // Given
        val tvShow = firstDetailUiModel()
        val givenViewState = GamesDetailViewState(tvShow)

        // When
        val actualResult = givenViewState.getGameNameTextView()

        // Then
        Truth.assertThat(actualResult).isEqualTo("firstTestName")
    }

    @Test
    fun `given a tv show, when the tv show released is checked, then it should match the given tv show released`() {

        // Given
        val tvShow = firstDetailUiModel()
        val givenViewState = GamesDetailViewState(tvShow)

        // When
        val actualResult = givenViewState.getReleasedTextView()

        // Then
        Truth.assertThat(actualResult).isEqualTo("firstTestReleased")
    }

    @Test
    fun `given a tv show, when the tv show playtime is checked, then it should match the given tv show playtime`() {

        // Given
        val tvShow = firstDetailUiModel()
        val givenViewState = GamesDetailViewState(tvShow)

        // When
        val actualResult = givenViewState.getPlaytimeTextView()

        // Then
        Truth.assertThat(actualResult).isEqualTo("firstTestPlaytime")
    }

    @Test
    fun `given a name, when the name is checked, then it should return VISIBLE if the name is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getGameNameIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a released, when the released is checked, then it should return VISIBLE if the released is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getReleasedIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a playtime, when the playtime is checked, then it should return VISIBLE if the playtime is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getPlaytimeIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a description, when the description is checked, then it should return VISIBLE if the description is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getDescriptionIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a redditUrl, when the redditUrl is checked, then it should return VISIBLE if the redditUrl is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getRedditIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a website, when the website is checked, then it should return VISIBLE if the website is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getWebsiteIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a genres, when the genres is checked, then it should return VISIBLE if the genres is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.genreIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a publisher, when the publisher is checked, then it should return VISIBLE if the publisher is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.publisherIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a metacritic, when the metacritic is checked, then it should return VISIBLE if the metacritic is not null or empty`() {
        // Given
        val state = GamesDetailViewState(firstDetailUiModel())

        // When
        val result = state.getMetacriticIsVisible()

        // Then
        Truth.assertThat(result).isEqualTo(View.VISIBLE)
    }

    @Test
    fun `given a metacritic value when getMetacriticTextViewBackground function is called, then it should return the correct background resource ID`() {
        val data1 = firstDetailUiModel()
        val data2 = secondDetailUiModel()
        val state1 = GamesDetailViewState(data1)
        val state2 = GamesDetailViewState(data2)

        val expectedBackground1 =
            formatMetacritic(data1.metacritic)?.first
        val expectedBackground2 =
            formatMetacritic(data2.metacritic)?.first

        assertEquals(expectedBackground1, state1.getMetacriticTextViewBackground())
        assertEquals(expectedBackground2, state2.getMetacriticTextViewBackground())
    }

    @Test
    fun `given a detail with publishers, when getPublisherTextView function is called, then it should return comma-separated publisher names`() {
        val data = firstDetailUiModel()
        val state = GamesDetailViewState(data)

        val expected = data.publishers.joinToString(separator = ", ") { it.name.toString() }
        assertEquals(expected, state.getPublisherTextView())
    }

    @Test
    fun `given a detail with genres, when getGenreTextView function is called, then it should return comma-separated genre names`() {
        val data = firstDetailUiModel()
        val state = GamesDetailViewState(data)

        val expected = data.genres.joinToString(separator = ", ") { it.name.toString() }
        assertEquals(expected, state.getGenreTextView())
    }
}