package com.asimodabas.data.di

import com.asimodabas.data.data.mapper.detail_local.DetailLocalMapper
import com.asimodabas.data.data.mapper.detail_local.DetailLocalMapperImpl
import com.asimodabas.data.data.mapper.game.GameMapper
import com.asimodabas.data.data.mapper.game.GameMapperImpl
import com.asimodabas.data.data.mapper.platform.PlatformMapper
import com.asimodabas.data.data.mapper.platform.PlatformMapperImpl
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