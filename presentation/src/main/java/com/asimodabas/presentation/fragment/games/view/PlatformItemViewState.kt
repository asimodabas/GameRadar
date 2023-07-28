package com.asimodabas.presentation.fragment.games.view

import com.asimodabas.domain.ui_model.PlatformUiModel
import com.asimodabas.presentation.R

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