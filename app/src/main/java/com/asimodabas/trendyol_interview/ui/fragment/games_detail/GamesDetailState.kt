package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.content.Context
import android.text.Html
import android.view.View
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.common.formatMetaCritic
import com.asimodabas.trendyol_interview.domain.model.Detail

data class GamesDetailState(
    var data: Detail
) {

    fun publisherIsVisible(): Int {
        return if (data.publishers.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun genreIsVisible(): Int {
        return if (data.genres.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getGameNameIsVisible(): Int {
        return if (data.name.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getPlaytimeIsVisible(): Int {
        return if (data.playtime.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getDescriptionIsVisible(): Int {
        return if (data.description.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getReleasedIsVisible(): Int {
        return if (data.released.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getWebsiteIsVisible(): Int {
        return if (data.website.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getRedditIsVisible(): Int {
        return if (data.reddit_url.isNullOrEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getMetacriticIsVisible(): Int {
        return if (data.metacritic.toString().isEmpty()) {
            View.GONE
        } else {
            View.VISIBLE
        }
    }

    fun getDescriptionTextView(): String {
        return if (data.description.isNullOrEmpty()) {
            ""
        } else {
            Html.fromHtml(data.description, Html.FROM_HTML_MODE_LEGACY).toString()
        }
    }

    fun getPlaytimeTextView(): String? = data.playtime

    fun getGameNameTextView(): String? = data.name

    fun getMetacriticTextView(): String = data.metacritic.toString()

    fun getReleasedTextView(): String? = data.released

    fun getWebsiteTextView(context: Context): String = context.getString(R.string.visit_website)

    fun getRedditTextView(context: Context): String = context.getString(R.string.visit_reddit)

    fun getMetacriticTextViewBackground(): Int = formatMetaCritic(data.metacritic).first

    fun getMetacriticTextViewColor(context: Context): Int = context.getColor(formatMetaCritic(data.metacritic).second)

    fun getPublisherTextView(): String = data.publishers?.joinToString(separator = ", ") { it.name.toString() } ?: ""

    fun getGenreTextView(): String = data.genres?.joinToString(separator = ", ") { it.name.toString() } ?: ""
}
