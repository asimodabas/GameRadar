package com.asimodabas.data.di

import com.asimodabas.data.repository.GameDetailRepository
import com.asimodabas.data.repository.GameDetailRoomRepository
import com.asimodabas.data.repository.GameRepository
import com.asimodabas.data.repository_impl.GameDetailRepositoryImpl
import com.asimodabas.data.repository_impl.GameDetailRoomRepositoryImpl
import com.asimodabas.data.repository_impl.GameRepositoryImpl
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