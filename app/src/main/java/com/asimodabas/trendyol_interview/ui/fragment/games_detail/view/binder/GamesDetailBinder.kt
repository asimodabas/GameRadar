package com.asimodabas.trendyol_interview.ui.fragment.games_detail.view.binder

import com.asimodabas.trendyol_interview.common.Constants.DESCRIPTION_MAX_COUNT
import com.asimodabas.trendyol_interview.common.loadUrl
import com.asimodabas.trendyol_interview.common.makeCollapsible
import com.asimodabas.trendyol_interview.databinding.FragmentGamesDetailBinding
import com.asimodabas.trendyol_interview.ui.fragment.games_detail.view.state.GamesDetailViewState

fun FragmentGamesDetailBinding.bind(
    state: GamesDetailViewState,
) {

    tvName.text = state.getGameNameTextView()
    tvName.visibility = state.getGameNameIsVisible()

    tvMetaCritic.text = state.getMetacriticTextView()
    tvMetaCritic.visibility = state.getMetacriticIsVisible()
    tvMetaCritic.setTextColor(state.getMetacriticTextViewColor(root.context))
    tvMetaCritic.setBackgroundResource(state.getMetacriticTextViewBackground())

    ivImageInfo.loadUrl(state.data.imageUrl.toString())

    customViewDescriptions.binding.apply {
        tvDescription.makeCollapsible(DESCRIPTION_MAX_COUNT, Int.MAX_VALUE)
        tvDescription.text = state.getDescriptionTextView()
        tvDescription.visibility = state.getDescriptionIsVisible()
    }

    customViewVisitWebsite.binding.apply {
        tvVisitConnect.text = state.getWebsiteTextView(root.context)
        tvVisitConnect.visibility = state.getWebsiteIsVisible()
        visitConnectLink.visibility = state.getWebsiteIsVisible()
    }

    customViewVisitReddit.binding.apply {
        tvVisitConnect.text = state.getRedditTextView(root.context)
        tvVisitConnect.visibility = state.getRedditIsVisible()
        visitConnectLink.visibility = state.getRedditIsVisible()
    }

    customViewInformations.binding.apply {
        tvPublishers.text = state.getPublisherTextView()
        tvPublishers.visibility = state.publisherIsVisible()
        tvPublishersInfo.visibility = state.publisherIsVisible()

        tvGenres.text = state.getGenreTextView()
        tvGenres.visibility = state.genreIsVisible()
        tvGenresInfo.visibility = state.genreIsVisible()

        tvPlayTime.text = state.getPlaytimeTextView()
        tvPlayTime.visibility = state.getPlaytimeIsVisible()
        tvPlayTimeInfo.visibility = state.getPlaytimeIsVisible()

        tvReleaseDate.text = state.getReleasedTextView()
        tvReleaseDate.visibility = state.getReleasedIsVisible()
        tvReleaseDateInfo.visibility = state.getReleasedIsVisible()
    }
}
