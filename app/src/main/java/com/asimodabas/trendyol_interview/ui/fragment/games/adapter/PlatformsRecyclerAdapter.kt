package com.asimodabas.trendyol_interview.ui.fragment.games.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.trendyol_interview.databinding.LayoutPlatformRowBinding
import com.asimodabas.trendyol_interview.domain.listener.PlatformsClickListener
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel
import com.asimodabas.trendyol_interview.ui.fragment.games.PlatformsState

class PlatformsRecyclerAdapter(
    private val platformsClickListener: PlatformsClickListener,
    private val platformsState: PlatformsState
) : ListAdapter<PlatformUiModel, PlatformsRecyclerAdapter.PlatformViewHolder>(DiffCallback) {

    class PlatformViewHolder(
        private val binding: LayoutPlatformRowBinding,
        private val platformsState: PlatformsState,
        private val platformsClickListener: PlatformsClickListener
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: PlatformUiModel) {
            with(platformsState) {
                bindPlatform(binding, item)
                binding.root.setOnClickListener {
                    toggleSelected(item.id)
                    updateBackground(isSelected(item.id), binding)
                    platformsClickListener.onItemClicked(item)
                }
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
            ), platformsClickListener = platformsClickListener, platformsState = platformsState
        )
    }

    override fun onBindViewHolder(holder: PlatformViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}