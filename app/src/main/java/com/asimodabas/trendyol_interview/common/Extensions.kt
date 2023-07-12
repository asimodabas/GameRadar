package com.asimodabas.trendyol_interview.common

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewbinding.ViewBinding
import com.asimodabas.trendyol_interview.R
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

fun getUrl(url: String) = Intent(Intent.ACTION_VIEW, Uri.parse(url))

fun getImage(
    context: Context,
    imageUrl: String,
    imageView: ImageView
) {
    Glide.with(context).load(imageUrl).into(imageView)
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