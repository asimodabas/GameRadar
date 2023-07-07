package com.asimodabas.trendyol_interview.ui.fragment.games.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.asimodabas.trendyol_interview.common.getGlide
import com.asimodabas.trendyol_interview.databinding.LayoutMainRowBinding
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.ui.fragment.games.GamesFragmentDirections

class GamesRecyclerAdapter(
    private val navController: NavController
) :
    ListAdapter<Detail, GamesRecyclerAdapter.GameViewHolder>(DiffCallback) {

    class GameViewHolder(
        private val binding: LayoutMainRowBinding,
        private val navController: NavController
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(detail: Detail) {
            with(binding) {
                tvGameTitle.text = detail.name
                getGlide(root.context, detail.imageUrl.toString(), ivGameImage)
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

    companion object DiffCallback : DiffUtil.ItemCallback<Detail>() {
        override fun areItemsTheSame(oldItem: Detail, newItem: Detail): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Detail, newItem: Detail): Boolean {

            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        return GameViewHolder(
            LayoutMainRowBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            navController
        )
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val currentList = currentList[position]
        holder.bind(currentList)
    }
}