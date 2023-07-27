package com.asimodabas.trendyol_interview.ui.fragment.games.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.trendyol_interview.databinding.LayoutPlatformRowBinding
import com.asimodabas.trendyol_interview.ui.fragment.games.view.PlatformItemViewState

class PlatformsRecyclerAdapter :
    ListAdapter<PlatformItemViewState, PlatformsRecyclerAdapter.PlatformViewHolder>(DiffCallback) {

    var platformListener: ((position:Int) -> Unit)? = null

    inner class PlatformViewHolder(
        private val binding: LayoutPlatformRowBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(platformItemViewState: PlatformItemViewState) = with(binding) {
            tvPlatformName.text = currentList[bindingAdapterPosition].getPlatformName()

            root.setBackgroundResource(currentList[bindingAdapterPosition].updatePlatformBackground())
            root.setOnClickListener {
                platformListener?.invoke(bindingAdapterPosition)
            }
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<PlatformItemViewState>() {
        override fun areItemsTheSame(
            oldItem: PlatformItemViewState,
            newItem: PlatformItemViewState
        ): Boolean {
            return oldItem.uiModel.id == newItem.uiModel.id
        }

        override fun areContentsTheSame(
            oldItem: PlatformItemViewState, newItem: PlatformItemViewState
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlatformViewHolder {
        return PlatformViewHolder(
            binding = LayoutPlatformRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: PlatformViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}