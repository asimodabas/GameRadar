package com.asimodabas.data.di

import com.asimodabas.data.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.data.usecase.delete_detail.DeleteDetailUseCaseImpl
import com.asimodabas.data.usecase.get_all_games.GetAllGamesPagerUseCase
import com.asimodabas.data.usecase.get_all_games.GetAllGamesPagerUseCaseImpl
import com.asimodabas.data.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.data.usecase.get_all_games.GetAllGamesUseCaseImpl
import com.asimodabas.data.usecase.get_details.GetDetailsUseCase
import com.asimodabas.data.usecase.get_details.GetDetailsUseCaseImpl
import com.asimodabas.data.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.data.usecase.get_game_detail.GetGameDetailUseCaseImpl
import com.asimodabas.data.usecase.get_game_search.GetGameSearchPagerUseCase
import com.asimodabas.data.usecase.get_game_search.GetGameSearchPagerUseCaseImpl
import com.asimodabas.data.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.data.usecase.get_game_search.GetGameSearchUseCaseImpl
import com.asimodabas.data.usecase.get_platforms.GetPlatformsUseCase
import com.asimodabas.data.usecase.get_platforms.GetPlatformsUseCaseImpl
import com.asimodabas.data.usecase.insert_details.InsertDetailsUseCase
import com.asimodabas.data.usecase.insert_details.InsertDetailsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindGetAllGamesUseCase(getAllGamesUseCaseImpl: GetAllGamesUseCaseImpl): GetAllGamesUseCase

    @Binds
    abstract fun bindGetGameSearchUseCase(getGameSearchUseCaseImpl: GetGameSearchUseCaseImpl): GetGameSearchUseCase

    @Binds
    abstract fun bindGetDetailUseCase(getDetailsUseCaseImpl: GetDetailsUseCaseImpl): GetDetailsUseCase

    @Binds
    abstract fun bindInsertDetailUseCase(insertDetailsUseCaseImpl: InsertDetailsUseCaseImpl): InsertDetailsUseCase

    @Binds
    abstract fun bindSearchPagerUseCase(searchPagerUseCaseImpl: GetGameSearchPagerUseCaseImpl): GetGameSearchPagerUseCase

    @Binds
    abstract fun bindDeleteDetailUseCase(deleteDetailUseCaseImpl: DeleteDetailUseCaseImpl): DeleteDetailUseCase

    @Binds
    abstract fun bindGetGameDetailUseCase(getGameDetailUseCaseImpl: GetGameDetailUseCaseImpl): GetGameDetailUseCase

    @Binds
    abstract fun bindGetPlatformsUseCase(getPlatformsUseCaseImpl: GetPlatformsUseCaseImpl): GetPlatformsUseCase

    @Binds
    abstract fun bindGetAllGamesPagerUseCase(getAllGamesPagerUseCaseImpl: GetAllGamesPagerUseCaseImpl): GetAllGamesPagerUseCase
}