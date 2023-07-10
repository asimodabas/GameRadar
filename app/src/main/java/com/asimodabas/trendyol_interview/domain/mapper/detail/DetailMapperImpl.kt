package com.asimodabas.trendyol_interview.domain.mapper.detail

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import javax.inject.Inject

class DetailMapperImpl @Inject constructor() : DetailMapper {
    override fun map(input: DetailLocal): Detail = Detail(
        input.id,
        input.name,
        input.released,
        input.playtime,
        input.description,
        input.reddit_url,
        input.website,
        emptyList(),
        emptyList(),
        input.metacritic,
        input.wishlist,
        input.imageUrl
    )
}