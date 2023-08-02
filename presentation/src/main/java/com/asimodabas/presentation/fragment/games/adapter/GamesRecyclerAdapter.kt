package com.asimodabas.presentation.fragment.games.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.domain.common.loadUrl
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.presentation.databinding.LayoutMainRowBinding
import com.asimodabas.presentation.fragment.games.GamesFragmentDirections

class GamesRecyclerAdapter(
    private val navController: NavController
) : PagingDataAdapter<GameUiModel, GamesRecyclerAdapter.GameViewHolder>(DiffCallback) {

    class GameViewHolder(
        private val binding: LayoutMainRowBinding, private val navController: NavController
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(detail: GameUiModel) {
            with(binding) {
                tvGameTitle.text = detail.name
                ivGameImage.loadUrl(detail.imageUrl.toString())
                root.setOnClickListener {
                    navController.navigate(
                        GamesFragmentDirections.actionGamesFragmentToGamesDetailFragment(
                            detail.id
                        )
                    )
                }
            }
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<GameUiModel>() {
        override fun areItemsTheSame(oldItem: GameUiModel, newItem: GameUiModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: GameUiModel, newItem: GameUiModel): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        return GameViewHolder(
            binding = LayoutMainRowBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            ), navController = navController
        )
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }
}