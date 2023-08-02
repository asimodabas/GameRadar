package com.asimodabas.presentation.view

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import com.asimodabas.domain.common.inflateCustomView
import com.asimodabas.presentation.databinding.CustomViewInformationsBinding

class InformationsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : CardView(context, attrs, defStyleAttr) {

    val binding = inflateCustomView(CustomViewInformationsBinding::inflate)
}