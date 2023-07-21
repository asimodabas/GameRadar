package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.content.Context
import android.text.Html
import android.view.View
import androidx.core.content.ContextCompat
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

    fun getMetacriticTextView(): String {
        val metacriticValue = data.metacritic ?: 0
        return metacriticValue.toString()
    }

    fun getMetacriticTextViewBackground(): Int {
        val formatResult = formatMetaCritic(data.metacritic)
        return formatResult?.first ?: R.drawable.bg_red_mc
    }

    fun getMetacriticTextViewColor(context: Context): Int {
        val formatResult = formatMetaCritic(data.metacritic)
        return if (formatResult != null) {
            context.getColor(formatResult.second)
        } else {
            ContextCompat.getColor(context, android.R.color.black)
        }
    }

    fun getPlaytimeTextView(): String? = data.playtime

    fun getGameNameTextView(): String? = data.name

    fun getReleasedTextView(): String? = data.released

    fun getWebsiteTextView(context: Context): String = context.getString(R.string.visit_website)

    fun getRedditTextView(context: Context): String = context.getString(R.string.visit_reddit)

    fun getPublisherTextView(): String = data.publishers?.joinToString(separator = ", ") { it.name.toString() } ?: ""

    fun getGenreTextView(): String = data.genres?.joinToString(separator = ", ") { it.name.toString() } ?: ""
}
