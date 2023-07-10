package com.asimodabas.trendyol_interview.di

import com.asimodabas.trendyol_interview.data.repository.GameDetailRepositoryImpl
import com.asimodabas.trendyol_interview.data.repository.GameRepositoryImpl
import com.asimodabas.trendyol_interview.data.repository.RoomRepositoryImpl
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRepository
import com.asimodabas.trendyol_interview.domain.repository.GameRepository
import com.asimodabas.trendyol_interview.domain.repository.RoomRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGamesRepository(gameRepositoryImpl: GameRepositoryImpl): GameRepository

    @Binds
    @ViewModelScoped
    abstract fun bindRoomRepository(roomRepositoryImpl: RoomRepositoryImpl): RoomRepository

    @Binds
    @ViewModelScoped
    abstract fun bindGameDetailRepository(gameDetailRepositoryImpl: GameDetailRepositoryImpl): GameDetailRepository
}