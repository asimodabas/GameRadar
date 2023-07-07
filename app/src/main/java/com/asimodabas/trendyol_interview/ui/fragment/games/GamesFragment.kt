package com.asimodabas.trendyol_interview.ui.fragment.games

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.common.viewBinding
import com.asimodabas.trendyol_interview.databinding.FragmentGamesBinding
import com.asimodabas.trendyol_interview.ui.fragment.games.adapter.GamesRecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GamesFragment : Fragment(R.layout.fragment_games) {

    private val binding by viewBinding(FragmentGamesBinding::bind)
    private val viewModel: GamesViewModel by viewModels()
    private lateinit var gamesRecyclerAdapter: GamesRecyclerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeGameData()
        searchQuery()
    }

    private fun searchQuery() {
        binding.searchView.setOnQueryTextListener(object :
            SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                binding.gamesRV.visibility = View.GONE
                viewModel.getSearchGames(p0.orEmpty())
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                return true
            }
        })
    }

    private fun observeGameData() {
        viewModel.gameState.observe(viewLifecycleOwner) { state ->
            with(binding) {
                state.success?.let { response ->
                    setupRv()
                    response.results.let { gamesRecyclerAdapter.submitList(it) }
                    gamesRV.isVisible = true
                }

                state.error?.let { message ->
                    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun setupRv() {
        binding.gamesRV.apply {
            gamesRecyclerAdapter = GamesRecyclerAdapter(findNavController())
            adapter = gamesRecyclerAdapter
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
            clipToPadding = false
        }
    }
}