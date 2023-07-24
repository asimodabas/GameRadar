package com.asimodabas.trendyol_interview.ui.fragment.wishlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.common.viewBinding
import com.asimodabas.trendyol_interview.databinding.FragmentWishlistBinding
import com.asimodabas.trendyol_interview.ui.fragment.wishlist.adapter.WishlistRecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WishlistFragment : Fragment(R.layout.fragment_wishlist) {

    private val viewModel: WishlistViewModel by viewModels()
    private val binding by viewBinding(FragmentWishlistBinding::bind)
    private lateinit var wishlistRecyclerAdapter: WishlistRecyclerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeWishlistData()
        viewModel.getWishlist()
    }

    private fun observeWishlistData() {
        viewModel.wishlistState.observe(viewLifecycleOwner) { state ->
            state.success?.let { response ->
                setupWishlistRv()
                response.let { wishlistRecyclerAdapter.submitList(it) }
            }
        }
    }

    private fun setupWishlistRv() {
        binding.wishListRV.apply {
            wishlistRecyclerAdapter = WishlistRecyclerAdapter(findNavController())
            adapter = wishlistRecyclerAdapter
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            clipToPadding = false
        }
    }
}