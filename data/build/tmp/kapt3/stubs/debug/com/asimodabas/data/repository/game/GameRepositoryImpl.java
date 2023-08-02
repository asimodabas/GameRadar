package com.asimodabas.data.repository.game;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/asimodabas/data/repository/game/GameRepositoryImpl;", "Lcom/asimodabas/data/repository/game/GameRepository;", "apiFactory", "Lcom/asimodabas/data/service/GameAPI;", "(Lcom/asimodabas/data/service/GameAPI;)V", "getAllGames", "Lcom/asimodabas/data/dto/GameDTO;", "nextPage", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGamePlatforms", "Lcom/asimodabas/data/dto/PlatformDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameSearch", "searchQuery", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class GameRepositoryImpl implements com.asimodabas.data.repository.game.GameRepository {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.data.service.GameAPI apiFactory = null;
    
    @javax.inject.Inject
    public GameRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.service.GameAPI apiFactory) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAllGames(@org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.GameDTO> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getGameSearch(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.GameDTO> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getGamePlatforms(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.PlatformDTO> $completion) {
        return null;
    }
}