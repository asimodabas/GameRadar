package com.asimodabas.trendyol_interview.ui.fragment.games

import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

data class PlatformsState(
    var data: PlatformUiModel? = null,
    var success: List<PlatformUiModel> = emptyList()
) {
    fun getPlatformNameTextView(): String = data?.name.toString()

    fun updatePlatfordBackground(): Int {
        return if (data?.isSelected == true) {
            R.drawable.bg_custom_platform_shape_select
        } else {
            R.drawable.bg_custom_platform_shape
        }
    }

    fun getPlatformClick(viewModel: GamesViewModel, platform: PlatformUiModel) {
        if (platform.isSelected) {
            viewModel.getSearchGames(platform.name)
        } else {
            viewModel.getGames()
        }
    }
}