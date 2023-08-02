package com.asimodabas.presentation.fragment.games_detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.asimodabas.domain.common.getUrl
import com.asimodabas.domain.common.viewBinding
import com.asimodabas.presentation.R
import com.asimodabas.presentation.databinding.FragmentGamesDetailBinding
import com.asimodabas.presentation.formatWishlist
import com.asimodabas.presentation.fragment.games_detail.view.binder.bind
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GamesDetailFragment : Fragment(R.layout.fragment_games_detail) {

    private val binding by viewBinding(FragmentGamesDetailBinding::bind)
    private val viewModel: GamesDetailViewModel by viewModels()
    private val args by navArgs<GamesDetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeDetailData()
        viewModel.getDetail(args.detailArgs)
    }

    private fun observeDetailData() = with(binding) {
        with(viewModel) {
            gamesDetailViewState.observe(viewLifecycleOwner) { detailState ->
                detailState?.let { state ->
                    bind(state)

                    checkWishlist(state.data)

                    buttonBack.setOnClickListener {
                        findNavController().navigate(GamesDetailFragmentDirections.actionGamesDetailFragmentToGamesFragment())
                    }
                    ivAddWishList.setOnClickListener {
                        wishlistClickButton(state.data)
                    }
                    customViewVisitWebsite.setOnClickListener {
                        startActivity(getUrl(state.data.website.toString()))
                    }
                    customViewVisitReddit.setOnClickListener {
                        startActivity(getUrl(state.data.reddit_url.toString()))
                    }
                }
            }

            wishlistState.observe(viewLifecycleOwner) { state ->
                formatWishlist(state, ivAddWishList)
            }
        }
    }
}