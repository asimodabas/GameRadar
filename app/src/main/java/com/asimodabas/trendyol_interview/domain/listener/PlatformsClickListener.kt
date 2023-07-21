package com.asimodabas.trendyol_interview.domain.listener

import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

interface PlatformsClickListener {
    fun onItemClicked(item: PlatformUiModel)
}