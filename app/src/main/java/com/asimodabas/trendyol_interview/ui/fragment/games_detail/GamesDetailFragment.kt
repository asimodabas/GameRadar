package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.asimodabas.trendyol_interview.R
import com.asimodabas.trendyol_interview.common.getDetailText
import com.asimodabas.trendyol_interview.common.getGenreFormat
import com.asimodabas.trendyol_interview.common.getImage
import com.asimodabas.trendyol_interview.common.getPublisherFormat
import com.asimodabas.trendyol_interview.common.getUrl
import com.asimodabas.trendyol_interview.common.makeCollapsible
import com.asimodabas.trendyol_interview.common.metacriticFormat
import com.asimodabas.trendyol_interview.common.viewBinding
import com.asimodabas.trendyol_interview.common.wishlistResource
import com.asimodabas.trendyol_interview.databinding.FragmentGamesDetailBinding
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.ui.view.VisitConnectView
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
            detailState.observe(viewLifecycleOwner) { state ->
                state.success?.let { detail ->
                    buttonBack.setOnClickListener {
                        findNavController().navigate(GamesDetailFragmentDirections.actionGamesDetailFragmentToGamesFragment())
                    }
                    ivAddWishList.setOnClickListener {
                        wishlistClickButton(detail)
                    }
                    checkWishlist(detail)
                    getGamesDetailData(detail)
                }

                state.error?.let {
                    Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
                }
            }

            wishlistState.observe(viewLifecycleOwner) { state ->
                wishlistResource(state, ivAddWishList)
            }
        }
    }

    private fun getGamesDetailData(detail: Detail) = with(binding) {
        metacriticFormat(detail, tvMetaCritic)
        getDescriptionBind(detail)
        getInformationBind(detail)
        getImage(requireContext(), detail.imageUrl.toString(), ivImageInfo)
        getConnectBind(
            detail.reddit_url.toString(),
            customViewVisitReddit,
            customViewVisitReddit.binding.tvVisitConnect,
            R.string.visit_reddit
        )
        getConnectBind(
            detail.website.toString(),
            customViewVisitWebsite,
            customViewVisitWebsite.binding.tvVisitConnect,
            R.string.visit_website
        )
    }

    private fun getDescriptionBind(detail: Detail) = with(binding) {
        customViewDescriptions.binding.apply {
            tvDescription.makeCollapsible(4, Int.MAX_VALUE)
            tvDescription.text =
                Html.fromHtml(detail.description, Html.FROM_HTML_MODE_LEGACY).toString()
        }
    }

    private fun getInformationBind(detail: Detail) = with(binding) {
        customViewInformations.binding.apply {
            tvName.text = detail.name
            tvGenres.text = getGenreFormat(detail, tvGenres, tvGenresInfo)
            tvPublishers.text = getPublisherFormat(detail, tvPublishers, tvPublishersInfo)
            getDetailText(detail.released, tvReleaseDate, tvReleaseDateInfo)
            getDetailText(detail.playtime, tvPlayTime, tvPlayTimeInfo)
        }
    }

    private fun getConnectBind(
        detail: String,
        customView: VisitConnectView,
        textView: TextView,
        setString: Int
    ) {
        customView.binding.apply {
            textView.text = getString(setString)
            customView.setOnClickListener {
                startActivity(getUrl(detail))
            }
        }
    }
}