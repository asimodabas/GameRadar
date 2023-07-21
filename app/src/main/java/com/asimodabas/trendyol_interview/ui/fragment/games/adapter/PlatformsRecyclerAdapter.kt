package com.asimodabas.trendyol_interview.ui.fragment.games.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.trendyol_interview.databinding.LayoutPlatformRowBinding
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel
import com.asimodabas.trendyol_interview.ui.fragment.games.PlatformsState

class PlatformsRecyclerAdapter :
    ListAdapter<PlatformUiModel, PlatformsRecyclerAdapter.PlatformViewHolder>(DiffCallback) {
    var platformListener: ((PlatformUiModel) -> Unit)? = null

    class PlatformViewHolder(
        private val binding: LayoutPlatformRowBinding,
        private val platformListener: ((PlatformUiModel) -> Unit)?,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PlatformUiModel) = with(binding) {
            val platformsState = PlatformsState(data = item)

            tvPlatformName.text = platformsState.getPlatformNameTextView()
            root.setBackgroundResource(platformsState.updatePlatfordBackground())
            root.setOnClickListener {
                item.isSelected = !item.isSelected
                root.setBackgroundResource(platformsState.updatePlatfordBackground())
                platformListener?.invoke(item)
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
            ),
            platformListener = platformListener,
        )
    }

    override fun onBindViewHolder(holder: PlatformViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}