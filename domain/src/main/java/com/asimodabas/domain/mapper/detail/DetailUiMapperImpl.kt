package com.asimodabas.domain.mapper.detail

import com.asimodabas.data.model.Detail
import com.asimodabas.domain.mapper.genre.GenreUiMapper
import com.asimodabas.domain.mapper.publisher.PublisherUiMapper
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class DetailUiMapperImpl @Inject constructor(
    private val genreUiMapper: GenreUiMapper,
    private val publisherUiMapper: PublisherUiMapper
) :
    DetailUiMapper {
    override fun map(input: Detail): DetailUiModel = DetailUiModel(
        id = input.id,
        name = input.name,
        released = input.released,
        playtime = input.playtime,
        description = input.description,
        genres = input.genres.map { genreUiMapper.map(it) },
        publishers = input.publishers.map { publisherUiMapper.map(it) },
        imageUrl = input.imageUrl,
        reddit_url = input.reddit_url,
        website = input.website,
        metacritic = input.metacritic,
        wishlist = input.wishlist,
    )
}