package com.asimodabas.trendyol_interview.ui.fragment.games.view

import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

data class PlatformItemViewState(
    var uiModel: PlatformUiModel
) {
    fun getPlatformName(): String = uiModel.name

    fun updatePlatformBackground(): Int {
        return if (uiModel.isSelected) {
            R.drawable.bg_custom_platform_shape_select
        } else {
            R.drawable.bg_custom_platform_shape
        }
    }
}