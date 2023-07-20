package com.asimodabas.trendyol_interview.ui.fragment.games.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.databinding.LayoutPlatformRowBinding
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel
import com.asimodabas.trendyol_interview.ui.fragment.games.GamesViewModel

class PlatformsRecyclerAdapter(
    private val gamesViewModel: GamesViewModel
) : ListAdapter<PlatformUiModel, PlatformsRecyclerAdapter.PlatformViewHolder>(DiffCallback) {

    class PlatformViewHolder(
        private val gamesViewModel: GamesViewModel,
        private val binding: LayoutPlatformRowBinding,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(detail: PlatformUiModel) {
            with(binding) {
                tvPlatformName.text = detail.name
                updateBackground(detail.isSelected)

                root.setOnClickListener {
                    val isSelected = !detail.isSelected
                    updateBackground(isSelected)
                    detail.isSelected = isSelected

                    if (isSelected) {
                        gamesViewModel.getSearchGames(detail.name)
                    } else {
                        gamesViewModel.getGames()
                    }
                }
            }
        }

        fun updateBackground(selected: Boolean) {
            if (selected) {
                binding.tvPlatformName.setBackgroundResource(R.drawable.bg_custom_platform_shape_select)
            } else {
                binding.tvPlatformName.setBackgroundResource(R.drawable.bg_custom_platform_shape)
            }
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<PlatformUiModel>() {
        override fun areItemsTheSame(oldItem: PlatformUiModel, newItem: PlatformUiModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: PlatformUiModel, newItem: PlatformUiModel
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlatformViewHolder {
        return PlatformViewHolder(
            binding = LayoutPlatformRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ), gamesViewModel = gamesViewModel
        )
    }

    override fun onBindViewHolder(holder: PlatformViewHolder, position: Int) {
        holder.bind(currentList[position])
        holder.updateBackground(currentList[position].isSelected)
    }
}