package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.common.formatMetaCritic
import com.asimodabas.trendyol_interview.domain.model.Detail

fun wishlistResource(
    state: Boolean,
    ivAddWishList: ImageView
) {
    if (state) {
        ivAddWishList.setImageResource(R.drawable.ic_wishlist_select)
    } else {
        ivAddWishList.setImageResource(R.drawable.ic_wishlist)
    }
}

fun getDetailTextFormat(
    state: Boolean,
    detail: String?,
    textView: TextView,
    textViewInfo: TextView
) {
    if (state) {
        textView.text = detail
    } else {
        textViewInfo.visibility = View.GONE
        textView.visibility = View.GONE
    }
}

fun getPublisherFormat(
    state: Boolean,
    detail: Detail,
    tvPublishers: TextView,
    tvPublishersInfo: TextView
): String {
    var allPublishers = ""
    if (state) {
        detail.publishers?.forEach { item ->
            allPublishers += " ${item.name}, "
        }
    } else {
        tvPublishersInfo.visibility = View.GONE
        tvPublishers.visibility = View.GONE
    }
    return allPublishers.dropLast(2)
}

fun getGenreFormat(
    state: Boolean,
    detail: Detail,
    tvPublishers: TextView,
    tvPublishersInfo: TextView
): String {
    var allGenres = ""
    if (state) {
        detail.genres?.forEach { item ->
            allGenres += " ${item.name}, "
        }
    } else {
        tvPublishersInfo.visibility = View.GONE
        tvPublishers.visibility = View.GONE
    }
    return allGenres.dropLast(2)
}

fun metacriticFormat(
    state: Boolean,
    detail: Detail,
    metariticTextView: TextView
) {
    with(metariticTextView) {
        if (state) {
            visibility = View.VISIBLE
            text = detail.metacritic.toString()
            setBackgroundResource(formatMetaCritic(detail.metacritic).first)
            setTextColor(
                ContextCompat.getColor(
                    context,
                    formatMetaCritic(detail.metacritic).second
                )
            )
        } else {
            visibility = View.GONE
        }
    }
}