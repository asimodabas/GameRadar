package com.asimodabas.presentation.fragment.games

import android.os.Bundle
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
import com.asimodabas.domain.common.Constants.GAMES_RV_GRID_COUNT
import com.asimodabas.domain.common.viewBinding
import com.asimodabas.presentation.R
import com.asimodabas.presentation.databinding.FragmentGamesBinding
import com.asimodabas.presentation.fragment.games.adapter.GamesRecyclerAdapter
import com.asimodabas.presentation.fragment.games.adapter.PlatformsRecyclerAdapter
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
        setupRv()
        observeGameData()
        observePlatformData()
        observeSelectedPlatformData()
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

    private fun observeGameData() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getGames()
            }
        }
        viewModel.gameState.observe(viewLifecycleOwner) { state ->
            state.success?.let { response ->
                lifecycleScope.launch {
                    response.let { gamesRecyclerAdapter.submitData(it) }
                }
            }

            state.error?.let { message ->
                Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun observePlatformData() {
        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.getPlatforms()
            }
        }

        viewModel.platformItemViewState.observe(viewLifecycleOwner) { state ->
            platformsRecyclerAdapter.submitList(state)
        }
    }

    private fun observeSelectedPlatformData() {
        viewLifecycleOwner.lifecycleScope.launch {
            platformsRecyclerAdapter.platformListener = { position ->
                viewModel.onPlatformItemClick(position)
                platformsRecyclerAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun setupRv() = with(binding) {
        gamesRV.apply {
            gamesRecyclerAdapter = GamesRecyclerAdapter(findNavController())
            adapter = gamesRecyclerAdapter
            layoutManager = GridLayoutManager(requireContext(), GAMES_RV_GRID_COUNT)
            setHasFixedSize(true)
            clipToPadding = false
        }
        platformsRV.apply {
            platformsRecyclerAdapter = PlatformsRecyclerAdapter()
            adapter = platformsRecyclerAdapter
            clipToPadding = false
        }
    }
}