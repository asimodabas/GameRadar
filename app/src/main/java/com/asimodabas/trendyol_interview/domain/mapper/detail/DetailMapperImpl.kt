package com.asimodabas.trendyol_interview.domain.mapper.detail

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import javax.inject.Inject

class DetailMapperImpl @Inject constructor() : DetailMapper {
    override fun map(input: DetailLocal): Detail = Detail(
        id = input.id,
        name = input.name,
        released = input.released,
        playtime = input.playtime,
        description = input.description,
        reddit_url = input.reddit_url,
        website = input.website,
        genres = emptyList(),
        publishers = emptyList(),
        metacritic = input.metacritic,
        wishlist = input.wishlist,
        imageUrl = input.background_image
    )
}