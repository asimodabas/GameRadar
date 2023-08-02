package com.asimodabas.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindGetAllGamesUseCase(getAllGamesUseCaseImpl: com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCaseImpl): com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCase

    @Binds
    abstract fun bindGetGameSearchUseCase(getGameSearchUseCaseImpl: com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCaseImpl): com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase

    @Binds
    abstract fun bindGetDetailUseCase(getDetailsUseCaseImpl: com.asimodabas.domain.usecase.get_details.GetDetailsUseCaseImpl): com.asimodabas.domain.usecase.get_details.GetDetailsUseCase

    @Binds
    abstract fun bindInsertDetailUseCase(insertDetailsUseCaseImpl: com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCaseImpl): com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase

    @Binds
    abstract fun bindSearchPagerUseCase(searchPagerUseCaseImpl: com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCaseImpl): com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase

    @Binds
    abstract fun bindDeleteDetailUseCase(deleteDetailUseCaseImpl: com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCaseImpl): com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase

    @Binds
    abstract fun bindGetGameDetailUseCase(getGameDetailUseCaseImpl: com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCaseImpl): com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase

    @Binds
    abstract fun bindGetPlatformsUseCase(getPlatformsUseCaseImpl: com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCaseImpl): com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase

    @Binds
    abstract fun bindGetAllGamesPagerUseCase(getAllGamesPagerUseCaseImpl: com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCaseImpl): com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase
}