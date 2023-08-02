package com.asimodabas.domain.mapper.detail

import com.asimodabas.data.model.Detail
import com.asimodabas.domain.mapper.genre.GenreMapper
import com.asimodabas.domain.mapper.publisher.PublisherMapper
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class DetailMapperImpl @Inject constructor(
    private val genreMapper: GenreMapper,
    private val publisherMapper: PublisherMapper
) : DetailMapper {
    override fun map(input: DetailUiModel): Detail = Detail(
        id = input.id,
        name = input.name,
        released = input.released,
        playtime = input.playtime,
        description = input.description,
        reddit_url = input.reddit_url,
        website = input.website,
        genres = input.genres.map { genreMapper.map(it) },
        publishers = input.publishers.map { publisherMapper.map(it) },
        metacritic = input.metacritic,
        imageUrl = input.imageUrl,
        wishlist = input.wishlist
    )
}