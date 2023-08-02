package com.asimodabas.domain.di

import com.asimodabas.data.repository.game.GameRepository
import com.asimodabas.data.repository.game.GameRepositoryImpl
import com.asimodabas.data.repository.game_detail.GameDetailRepository
import com.asimodabas.data.repository.game_detail.GameDetailRepositoryImpl
import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository
import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepositoryImpl
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
    abstract fun bindRoomRepository(gameDetailRoomRepositoryImpl: GameDetailRoomRepositoryImpl): GameDetailRoomRepository

    @Binds
    @ViewModelScoped
    abstract fun bindGameDetailRepository(gameDetailRepositoryImpl: GameDetailRepositoryImpl): GameDetailRepository
}