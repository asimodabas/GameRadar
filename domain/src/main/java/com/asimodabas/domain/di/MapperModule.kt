package com.asimodabas.domain.di

import com.asimodabas.domain.mapper.detail.DetailMapper
import com.asimodabas.domain.mapper.detail.DetailMapperImpl
import com.asimodabas.domain.mapper.detail.DetailUiMapper
import com.asimodabas.domain.mapper.detail.DetailUiMapperImpl
import com.asimodabas.domain.mapper.game.GameMapper
import com.asimodabas.domain.mapper.game.GameMapperImpl
import com.asimodabas.domain.mapper.game_detail.GameDetailMapper
import com.asimodabas.domain.mapper.game_detail.GameDetailMapperImpl
import com.asimodabas.domain.mapper.genre.GenreMapper
import com.asimodabas.domain.mapper.genre.GenreMapperImpl
import com.asimodabas.domain.mapper.genre.GenreUiMapper
import com.asimodabas.domain.mapper.genre.GenreUiMapperImpl
import com.asimodabas.domain.mapper.platform.PlatformMapper
import com.asimodabas.domain.mapper.platform.PlatformMapperImpl
import com.asimodabas.domain.mapper.publisher.PublisherMapper
import com.asimodabas.domain.mapper.publisher.PublisherMapperImpl
import com.asimodabas.domain.mapper.publisher.PublisherUiMapper
import com.asimodabas.domain.mapper.publisher.PublisherUiMapperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class MapperModule {

    @Binds
    abstract fun bindGamesMapper(gameMapperImpl: GameMapperImpl): GameMapper

    @Binds
    abstract fun bindPlatformsMapper(platformMapperImpl: PlatformMapperImpl): PlatformMapper

    @Binds
    abstract fun bindDetailMapper(detailMapperImpl: DetailMapperImpl): DetailMapper

    @Binds
    abstract fun bindGenreMapper(genreMapperImpl: GenreMapperImpl): GenreMapper

    @Binds
    abstract fun bindGenreUiMapper(genreUiMapperImpl: GenreUiMapperImpl): GenreUiMapper

    @Binds
    abstract fun bindPublisherMapper(publisherMapperImpl: PublisherMapperImpl): PublisherMapper

    @Binds
    abstract fun bindPublisherUiMapper(publisherUiMapperImpl: PublisherUiMapperImpl): PublisherUiMapper

    @Binds
    abstract fun bindDetailLocalMapper(detailLocalMapperImpl: DetailUiMapperImpl): DetailUiMapper

    @Binds
    abstract fun bindGameDetailLocalMapper(gameDetailMapperImpl: GameDetailMapperImpl): GameDetailMapper
}