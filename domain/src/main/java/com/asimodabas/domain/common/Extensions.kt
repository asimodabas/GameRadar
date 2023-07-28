package com.asimodabas.domain.common

import android.content.Intent
import android.net.Uri
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewbinding.ViewBinding
import com.asimodabas.domain.R
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

fun ImageView.loadUrl(imageUrl: String) =
    Glide.with(context)
        .load(imageUrl)
        .centerCrop()
        .into(this)

fun getUrl(url: String) = Intent(Intent.ACTION_VIEW, Uri.parse(url))

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