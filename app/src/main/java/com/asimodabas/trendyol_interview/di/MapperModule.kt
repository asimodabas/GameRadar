package com.asimodabas.trendyol_interview.di

import com.asimodabas.trendyol_interview.domain.mapper.detail_local.DetailLocalMapper
import com.asimodabas.trendyol_interview.domain.mapper.detail_local.DetailLocalMapperImpl
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapperImpl
import com.asimodabas.trendyol_interview.domain.mapper.platform.PlatformMapper
import com.asimodabas.trendyol_interview.domain.mapper.platform.PlatformMapperImpl
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
    abstract fun bindDetailLocalMapper(detailLocalMapperImpl: DetailLocalMapperImpl): DetailLocalMapper
}