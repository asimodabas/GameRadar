package com.asimodabas.data.mapper.detail_local

import com.asimodabas.domain.model.Detail
import com.asimodabas.domain.model.DetailLocal
import javax.inject.Inject

class DetailLocalMapperImpl @Inject constructor() :
    DetailLocalMapper {
    override fun map(input: Detail): DetailLocal = DetailLocal(
        id = input.id,
        name = input.name,
        released = input.released,
        playtime = input.playtime,
        description = input.description,
        reddit_url = input.reddit_url,
        website = input.website,
        metacritic = input.metacritic,
        wishlist = input.wishlist,
        background_image = input.imageUrl
    )
}