package com.asimodabas.trendyol_interview.di

import com.asimodabas.trendyol_interview.domain.mapper.detail_local.DetailLocalMapper
import com.asimodabas.trendyol_interview.domain.mapper.detail_local.DetailLocalMapperImpl
import com.asimodabas.trendyol_interview.domain.mapper.detail.DetailMapper
import com.asimodabas.trendyol_interview.domain.mapper.detail.DetailMapperImpl
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapper
import com.asimodabas.trendyol_interview.domain.mapper.game.GameMapperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class MapperModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGamesMapper(gameMapperImpl: GameMapperImpl): GameMapper

    @Binds
    @ViewModelScoped
    abstract fun bindDetailMapper(detailMapperImpl: DetailMapperImpl): DetailMapper

    @Binds
    @ViewModelScoped
    abstract fun bindDetailLocalMapper(detailLocalMapperImpl: DetailLocalMapperImpl): DetailLocalMapper
}