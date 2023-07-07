package com.asimodabas.trendyol_interview.ui.fragment.view

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import com.asimodabas.trendyol_interview.common.inflateCustomView
import com.asimodabas.trendyol_interview.databinding.CustomViewVisitConnectBinding

class VisitConnectView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : CardView(context, attrs, defStyleAttr) {

    val binding = inflateCustomView(CustomViewVisitConnectBinding::inflate)
}