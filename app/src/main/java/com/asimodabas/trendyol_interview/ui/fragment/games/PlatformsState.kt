package com.asimodabas.trendyol_interview.ui.fragment.games

import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.databinding.LayoutPlatformRowBinding
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel

class PlatformsState {
    private val selectedPlatforms = mutableSetOf<Int>()

    fun isSelected(id: Int): Boolean {
        return selectedPlatforms.contains(id)
    }

    fun toggleSelected(id: Int) {
        if (selectedPlatforms.contains(id)) {
            selectedPlatforms.remove(id)
        } else {
            selectedPlatforms.add(id)
        }
    }

    fun updateBackground(selected: Boolean, binding: LayoutPlatformRowBinding) {
        if (selected) {
            binding.tvPlatformName.setBackgroundResource(R.drawable.bg_custom_platform_shape_select)
        } else {
            binding.tvPlatformName.setBackgroundResource(R.drawable.bg_custom_platform_shape)
        }
    }

    fun bindPlatform(binding: LayoutPlatformRowBinding, platform: PlatformUiModel) {
        with(binding) {
            tvPlatformName.text = platform.name
            updateBackground(isSelected(platform.id), this)
        }
    }

    fun getGamesClick(item: PlatformUiModel, viewModel: GamesViewModel) {
        item.isSelected = !item.isSelected

        if (item.isSelected) {
            viewModel.getSearchGames(item.name)
        } else {
            viewModel.getGames()
        }
    }
}