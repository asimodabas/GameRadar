package com.asimodabas.data.repository.game;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/asimodabas/data/repository/game/GameRepository;", "", "getAllGames", "Lcom/asimodabas/data/dto/GameDTO;", "nextPage", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGamePlatforms", "Lcom/asimodabas/data/dto/PlatformDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameSearch", "searchQuery", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface GameRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllGames(@org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.GameDTO> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGameSearch(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.GameDTO> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGamePlatforms(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.PlatformDTO> $completion);
}