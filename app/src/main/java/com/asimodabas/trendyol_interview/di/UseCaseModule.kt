package com.asimodabas.trendyol_interview.di

import com.asimodabas.trendyol_interview.domain.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.trendyol_interview.domain.usecase.delete_detail.DeleteDetailUseCaseImpl
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCaseImpl
import com.asimodabas.trendyol_interview.domain.usecase.get_details.GetDetailsUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_details.GetDetailsUseCaseImpl
import com.asimodabas.trendyol_interview.domain.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_detail.GetGameDetailUseCaseImpl
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCaseImpl
import com.asimodabas.trendyol_interview.domain.usecase.get_platforms.GetPlatformsUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_platforms.GetPlatformsUseCaseImpl
import com.asimodabas.trendyol_interview.domain.usecase.insert_details.InsertDetailsUseCase
import com.asimodabas.trendyol_interview.domain.usecase.insert_details.InsertDetailsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindGetAllGamesUseCase(getAllGamesUseCaseImpl: GetAllGamesUseCaseImpl): GetAllGamesUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetGameSearchUseCase(getGameSearchUseCaseImpl: GetGameSearchUseCaseImpl): GetGameSearchUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetDetailUseCase(getDetailsUseCaseImpl: GetDetailsUseCaseImpl): GetDetailsUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindInsertDetailUseCase(insertDetailsUseCaseImpl: InsertDetailsUseCaseImpl): InsertDetailsUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindDeleteDetailUseCase(deleteDetailUseCaseImpl: DeleteDetailUseCaseImpl): DeleteDetailUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetGameDetailUseCase(getGameDetailUseCaseImpl: GetGameDetailUseCaseImpl): GetGameDetailUseCase

    @Binds
    @ViewModelScoped
    abstract fun bindGetPlatformsUseCase(getPlatformsUseCaseImpl: GetPlatformsUseCaseImpl): GetPlatformsUseCase
}