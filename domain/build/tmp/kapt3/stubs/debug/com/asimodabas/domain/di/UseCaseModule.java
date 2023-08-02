package com.asimodabas.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\'\u00a8\u0006\'"}, d2 = {"Lcom/asimodabas/domain/di/UseCaseModule;", "", "()V", "bindDeleteDetailUseCase", "Lcom/asimodabas/domain/usecase/delete_detail/DeleteDetailUseCase;", "deleteDetailUseCaseImpl", "Lcom/asimodabas/domain/usecase/delete_detail/DeleteDetailUseCaseImpl;", "bindGetAllGamesPagerUseCase", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCase;", "getAllGamesPagerUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCaseImpl;", "bindGetAllGamesUseCase", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesUseCase;", "getAllGamesUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesUseCaseImpl;", "bindGetDetailUseCase", "Lcom/asimodabas/domain/usecase/get_details/GetDetailsUseCase;", "getDetailsUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_details/GetDetailsUseCaseImpl;", "bindGetGameDetailUseCase", "Lcom/asimodabas/domain/usecase/get_game_detail/GetGameDetailUseCase;", "getGameDetailUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_game_detail/GetGameDetailUseCaseImpl;", "bindGetGameSearchUseCase", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCase;", "getGameSearchUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCaseImpl;", "bindGetPlatformsUseCase", "Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCase;", "getPlatformsUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCaseImpl;", "bindInsertDetailUseCase", "Lcom/asimodabas/domain/usecase/insert_details/InsertDetailsUseCase;", "insertDetailsUseCaseImpl", "Lcom/asimodabas/domain/usecase/insert_details/InsertDetailsUseCaseImpl;", "bindSearchPagerUseCase", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchPagerUseCase;", "searchPagerUseCaseImpl", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchPagerUseCaseImpl;", "domain_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public abstract class UseCaseModule {
    
    public UseCaseModule() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCase bindGetAllGamesUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCaseImpl getAllGamesUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase bindGetGameSearchUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCaseImpl getGameSearchUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_details.GetDetailsUseCase bindGetDetailUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_details.GetDetailsUseCaseImpl getDetailsUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase bindInsertDetailUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCaseImpl insertDetailsUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase bindSearchPagerUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCaseImpl searchPagerUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase bindDeleteDetailUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCaseImpl deleteDetailUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase bindGetGameDetailUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCaseImpl getGameDetailUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase bindGetPlatformsUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCaseImpl getPlatformsUseCaseImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase bindGetAllGamesPagerUseCase(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCaseImpl getAllGamesPagerUseCaseImpl);
}