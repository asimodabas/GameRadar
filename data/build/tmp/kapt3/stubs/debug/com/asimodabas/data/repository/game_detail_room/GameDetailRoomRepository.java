package com.asimodabas.data.repository.game_detail_room;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepository;", "", "deleteDetail", "", "detail", "Lcom/asimodabas/data/model/Detail;", "(Lcom/asimodabas/data/model/Detail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetails", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetail", "data_debug"})
public abstract interface GameDetailRoomRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetails(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.asimodabas.data.model.Detail>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertDetail(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.model.Detail detail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteDetail(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.model.Detail detail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}