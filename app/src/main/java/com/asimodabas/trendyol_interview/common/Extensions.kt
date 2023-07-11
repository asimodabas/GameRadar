package com.asimodabas.trendyol_interview.common

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewbinding.ViewBinding
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.bumptech.glide.Glide

fun TextView.makeCollapsible(
    maxLinesCollapsed: Int,
    maxLinesExpanded: Int
) {
    maxLines = maxLinesCollapsed

    setOnClickListener {
        maxLines = if (maxLines == maxLinesCollapsed) {
            maxLinesExpanded
        } else {
            maxLinesCollapsed
        }
        TransitionManager.beginDelayedTransition(parent as ViewGroup)
    }
}

fun metacriticFormat(
    detail: Detail,
    metariticTextView: TextView
) {
    with(metariticTextView) {
        if (detail.metacritic == null) {
            visibility = View.GONE
        } else {
            visibility = View.VISIBLE
            text = detail.metacritic.toString()
            setBackgroundResource(formatMetaCritic(detail.metacritic).first)
            setTextColor(
                ContextCompat.getColor(
                    context,
                    formatMetaCritic(detail.metacritic).second
                )
            )
        }
    }
}

fun formatMetaCritic(metaCritic: Int?): Pair<Int, Int> {
    var backgroundResource = 0
    var textColor = 0

    when (metaCritic) {
        in 1..49 -> {
            backgroundResource = R.drawable.bg_red_mc
            textColor = R.color.red
        }

        in 50..75 -> {
            backgroundResource = R.drawable.bg_yellow_mc
            textColor = R.color.yellow
        }

        in 75..101 -> {
            backgroundResource = R.drawable.bg_green_mc
            textColor = R.color.green
        }
    }

    return backgroundResource to textColor
}

fun getUrl(url: String) = Intent(Intent.ACTION_VIEW, Uri.parse(url))

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

fun getImage(
    context: Context,
    imageUrl: String,
    imageView: ImageView
) {
    Glide.with(context).load(imageUrl).into(imageView)
}

fun getDetailText(
    detail: String?,
    textView: TextView,
    textViewInfo: TextView
) {
    if (detail != null) {
        textView.text = detail
    } else {
        textViewInfo.visibility = View.GONE
        textView.visibility = View.GONE
    }
}

fun getPublisherFormat(
    detail: Detail,
    tvPublishers: TextView,
    tvPublishersInfo: TextView
): String {
    var allPublishers = ""
    if (detail.publishers != null) {
        detail.publishers.forEach { item ->
            allPublishers += " ${item.name}, "
        }
    } else {
        tvPublishersInfo.visibility = View.GONE
        tvPublishers.visibility = View.GONE
    }
    return allPublishers.dropLast(2)
}

fun getGenreFormat(
    detail: Detail,
    tvGenres: TextView,
    tvGenresInfo: TextView
): String {
    var allGenres = ""
    if (detail.genres != null) {
        detail.genres.forEach { item ->
            allGenres += " ${item.name}, "
        }
    } else {
        tvGenresInfo.visibility = View.GONE
        tvGenres.visibility = View.GONE
    }
    return allGenres.dropLast(2)
}

fun <T : ViewBinding> ViewGroup.inflate(
    viewBindingFactory: (LayoutInflater, ViewGroup, Boolean) -> T,
    attachToParent: Boolean = false,
): T {
    return viewBindingFactory.invoke(
        LayoutInflater.from(context),
        this,
        attachToParent
    )
}

fun <T : ViewBinding> ViewGroup.inflateCustomView(
    viewBindingFactory: (LayoutInflater, ViewGroup, Boolean) -> T
): T {
    return inflate(viewBindingFactory, attachToParent = true)
}