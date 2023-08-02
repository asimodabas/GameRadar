package com.asimodabas.domain.mapper.game_detail

import com.asimodabas.data.model.Detail
import com.asimodabas.domain.mapper.genre.GenreUiMapper
import com.asimodabas.domain.mapper.publisher.PublisherUiMapper
import com.asimodabas.domain.ui_model.DetailUiModel
import javax.inject.Inject

class GameDetailMapperImpl @Inject constructor(
    private val genreUiMapper: GenreUiMapper,
    private val publisherUiMapper: PublisherUiMapper
) : GameDetailMapper {
    override fun map(input: List<Detail>): List<DetailUiModel> =
        input.map {
            DetailUiModel(
                id = it.id,
                name = it.name,
                released = it.released,
                playtime = it.playtime,
                description = it.description,
                reddit_url = it.reddit_url,
                website = it.website,
                genres = it.genres.map { genreUiMapper.map(it) },
                publishers = it.publishers.map { publisherUiMapper.map(it) },
                metacritic = it.metacritic,
                imageUrl = it.imageUrl,
                wishlist = it.wishlist
            )
        }
}