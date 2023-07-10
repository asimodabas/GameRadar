package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import android.content.Context
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
import com.asimodabas.trendyol_interview.common.formatMetaCritic
import com.asimodabas.trendyol_interview.common.getGlide
import com.asimodabas.trendyol_interview.common.getUrl
import com.asimodabas.trendyol_interview.common.makeCollapsible
import com.asimodabas.trendyol_interview.common.viewBinding
import com.asimodabas.trendyol_interview.databinding.FragmentGamesDetailBinding
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.ui.view.VisitConnectView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

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
        viewModel.detailState.observe(viewLifecycleOwner) { state ->
            state.success?.let { detail ->
                buttonBack.setOnClickListener {
                    findNavController().navigate(GamesDetailFragmentDirections.actionGamesDetailFragmentToGamesFragment())
                }
                val sharedPref =
                    requireContext().getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)

                if (sharedPref.getBoolean(detail.name, false)) {
                    ivAddWishList.setImageResource(R.drawable.ic_wishlist_select)
                    detail.wishlist = true
                } else {
                    ivAddWishList.setImageResource(R.drawable.ic_wishlist)
                    detail.wishlist = false
                }

                getGlide(requireContext(), detail.imageUrl.toString(), ivImageInfo)
                getGamesDetailData(detail)
                wishlistClickButton(viewModel.detailToDetailLocal(detail))
            }

            state.error?.let {
                Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun wishlistClickButton(detail: DetailLocal) = with(binding) {
        ivAddWishList.setOnClickListener {
            if (detail.wishlist) {
                detail.wishlist = false
                ivAddWishList.setImageResource(R.drawable.ic_wishlist)

                CoroutineScope(Dispatchers.IO).launch {
                    viewModel.deleteWishList(detail)

                    val sharedPref =
                        requireContext().getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
                    sharedPref.edit().remove(detail.name).apply()
                }
            } else {
                detail.wishlist = true
                ivAddWishList.setImageResource(R.drawable.ic_wishlist_select)

                CoroutineScope(Dispatchers.IO).launch {
                    viewModel.addWishList(detail)

                    val sharedPref =
                        requireContext().getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
                    sharedPref.edit().putBoolean(detail.name, true).apply()
                }
            }
        }
    }

    private fun getGamesDetailData(detail: Detail) = with(binding) {
        checkMetacritic(detail)
        getDescriptionBind(detail)
        getInformationBind(detail)
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
            getDetailText(detail.released, tvReleaseDate, tvReleaseDateInfo)
            getDetailText(detail.playtime, tvPlayTime, tvPlayTimeInfo)

            if (detail.genres != null) {
                var allGenres = ""
                detail.genres.forEach { item ->
                    allGenres += " ${item.name}, "
                }
                tvGenres.text = allGenres.dropLast(2)
            } else {
                tvGenresInfo.visibility = View.GONE
                tvGenres.visibility = View.GONE
            }

            if (detail.publishers != null) {
                var allPublishers = ""
                detail.publishers.forEach { item ->
                    allPublishers += " ${item.name}, "
                }
                tvPublishers.text = allPublishers.dropLast(2)
            } else {
                tvPublishersInfo.visibility = View.GONE
                tvPublishers.visibility = View.GONE
            }
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
                detail.let { url -> startActivity(getUrl(url)) }
            }
        }
    }

    private fun getDetailText(detail: String?, textView: TextView, textViewInfo: TextView) {
        if (detail != null) {
            textView.text = detail
        } else {
            textViewInfo.visibility = View.GONE
            textView.visibility = View.GONE
        }
    }

    private fun checkMetacritic(detail: Detail) = with(binding) {
        detail.metacritic.let { metaCritic ->
            with(tvMetaCritic) {
                if (metaCritic == null) {
                    visibility = View.GONE
                } else {
                    visibility = View.VISIBLE
                    text = metaCritic.toString()
                    setBackgroundResource(formatMetaCritic(metaCritic).first)
                    setTextColor(
                        androidx.core.content.ContextCompat.getColor(
                            context,
                            formatMetaCritic(metaCritic).second
                        )
                    )
                }
            }
        }
    }
}