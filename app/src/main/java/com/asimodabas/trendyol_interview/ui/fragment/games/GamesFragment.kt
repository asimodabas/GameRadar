package com.asimodabas.trendyol_interview.ui.fragment.games

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.common.Constants.GAMES_RV_GRID_COUNT
import com.asimodabas.trendyol_interview.common.viewBinding
import com.asimodabas.trendyol_interview.databinding.FragmentGamesBinding
import com.asimodabas.trendyol_interview.ui.fragment.games.adapter.GamesRecyclerAdapter
import com.asimodabas.trendyol_interview.ui.fragment.games.adapter.PlatformsRecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class GamesFragment : Fragment(R.layout.fragment_games) {

    private val binding by viewBinding(FragmentGamesBinding::bind)
    private val viewModel: GamesViewModel by viewModels()
    private lateinit var gamesRecyclerAdapter: GamesRecyclerAdapter
    private lateinit var platformsRecyclerAdapter: PlatformsRecyclerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchQuery()
        setupGamesRv()
        setupPlatformsRv()
        observePlatformData()
        observeGameData()
    }

    private fun searchQuery() {
        binding.searchView.setOnQueryTextListener(object :
            SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(searchQuery: String?): Boolean {
                viewModel.getSearchGames(searchQuery.orEmpty())
                return true
            }

            override fun onQueryTextChange(searchQuery: String?): Boolean {
                return true
            }
        })
    }

    private fun observePlatformData() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getPlatforms()
            }
        }
        viewModel.platformsState.observe(viewLifecycleOwner) { state ->
            state.success.let { platforms ->
                platformsRecyclerAdapter.submitList(platforms)
            }
            state.error.let { error ->
                Log.d("Error", "ErrorState: $error")
            }
        }
    }

    private fun observeGameData() {
        viewModel.gameState.observe(viewLifecycleOwner) { state ->
            state.success?.let { response ->
                response.let { gamesRecyclerAdapter.submitList(it) }
            }

            state.error?.let { message ->
                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setupGamesRv() = with(binding) {
        gamesRV.apply {
            gamesRecyclerAdapter = GamesRecyclerAdapter(findNavController())
            adapter = gamesRecyclerAdapter
            layoutManager = GridLayoutManager(requireContext(), GAMES_RV_GRID_COUNT)
            setHasFixedSize(true)
            clipToPadding = false
        }
    }

    private fun setupPlatformsRv() = with(binding) {
        platformsRV.apply {
            platformsRecyclerAdapter = PlatformsRecyclerAdapter(viewModel)
            adapter = platformsRecyclerAdapter
            clipToPadding = false
        }
    }
}