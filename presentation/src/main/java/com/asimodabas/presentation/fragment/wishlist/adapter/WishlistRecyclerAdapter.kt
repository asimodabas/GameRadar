package com.asimodabas.presentation.fragment.wishlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.domain.common.loadUrl
import com.asimodabas.domain.ui_model.DetailUiModel
import com.asimodabas.presentation.databinding.LayoutWishlistRowBinding
import com.asimodabas.presentation.fragment.wishlist.WishlistFragmentDirections

class WishlistRecyclerAdapter(
    private val navController: NavController
) : ListAdapter<DetailUiModel, WishlistRecyclerAdapter.GameViewHolder>(DiffCallback) {

    class GameViewHolder(
        private val binding: LayoutWishlistRowBinding,
        private val navController: NavController
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(detail: DetailUiModel) {
            with(binding) {
                tvWishlistName.text = detail.name
                tvReleased.text = detail.released
                tvMetacritic.text = detail.metacritic.toString()
                ivWishlist.loadUrl(detail.imageUrl.toString())
                root.setOnClickListener {
                    navController.navigate(
                        WishlistFragmentDirections.actionWishlistFragmentToGamesDetailFragment(
                            detail.id
                        )
                    )
                }
            }
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<DetailUiModel>() {
        override fun areItemsTheSame(oldItem: DetailUiModel, newItem: DetailUiModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: DetailUiModel, newItem: DetailUiModel
        ): Boolean {
            return oldItem.imageUrl == newItem.imageUrl
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        return GameViewHolder(
            binding = LayoutWishlistRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ), navController = navController
        )
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}