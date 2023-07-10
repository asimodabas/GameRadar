package com.asimodabas.trendyol_interview.domain.mapper.detail_local

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import javax.inject.Inject

class DetailLocalMapperImpl @Inject constructor() : DetailLocalMapper {
    override fun map(input: Detail): DetailLocal = DetailLocal(
        input.id,
        input.name,
        input.released,
        input.playtime,
        input.description,
        input.reddit_url,
        input.website,
        input.metacritic,
        input.wishlist,
        input.imageUrl
    )
}