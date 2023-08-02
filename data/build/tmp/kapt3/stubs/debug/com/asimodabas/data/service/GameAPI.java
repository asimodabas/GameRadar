package com.asimodabas.data.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ/\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/asimodabas/data/service/GameAPI;", "", "getAllData", "Lcom/asimodabas/data/dto/GameDTO;", "nextPage", "", "apiKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameDetail", "Lcom/asimodabas/data/model/Detail;", "id", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameSearch", "searchQuery", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getParentPlatform", "Lcom/asimodabas/data/dto/PlatformDTO;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface GameAPI {
    
    @retrofit2.http.GET(value = "games")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllData(@retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.GameDTO> $completion);
    
    @retrofit2.http.GET(value = "games")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGameSearch(@retrofit2.http.Query(value = "search")
    @org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @retrofit2.http.Query(value = "page")
    @org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.GameDTO> $completion);
    
    @retrofit2.http.GET(value = "platforms")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getParentPlatform(@retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.dto.PlatformDTO> $completion);
    
    @retrofit2.http.GET(value = "games/{id}")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getGameDetail(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "key")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.data.model.Detail> $completion);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}