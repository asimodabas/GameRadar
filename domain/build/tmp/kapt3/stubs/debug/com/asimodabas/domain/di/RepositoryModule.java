package com.asimodabas.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/asimodabas/domain/di/RepositoryModule;", "", "()V", "bindGameDetailRepository", "Lcom/asimodabas/data/repository/game_detail/GameDetailRepository;", "gameDetailRepositoryImpl", "Lcom/asimodabas/data/repository/game_detail/GameDetailRepositoryImpl;", "bindGamesRepository", "Lcom/asimodabas/data/repository/game/GameRepository;", "gameRepositoryImpl", "Lcom/asimodabas/data/repository/game/GameRepositoryImpl;", "bindRoomRepository", "Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepository;", "gameDetailRoomRepositoryImpl", "Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepositoryImpl;", "domain_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.data.repository.game.GameRepository bindGamesRepository(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game.GameRepositoryImpl gameRepositoryImpl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository bindRoomRepository(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepositoryImpl gameDetailRoomRepositoryImpl);
    
    @dagger.Binds
    @dagger.hilt.android.scopes.ViewModelScoped
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.data.repository.game_detail.GameDetailRepository bindGameDetailRepository(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game_detail.GameDetailRepositoryImpl gameDetailRepositoryImpl);
}