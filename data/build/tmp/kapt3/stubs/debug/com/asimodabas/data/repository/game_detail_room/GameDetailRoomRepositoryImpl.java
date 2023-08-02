package com.asimodabas.data.repository.game_detail_room;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepositoryImpl;", "Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepository;", "dao", "Lcom/asimodabas/data/room/GameDAO;", "(Lcom/asimodabas/data/room/GameDAO;)V", "deleteDetail", "", "detail", "Lcom/asimodabas/data/model/Detail;", "(Lcom/asimodabas/data/model/Detail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetails", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetail", "data_debug"})
public final class GameDetailRoomRepositoryImpl implements com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.data.room.GameDAO dao = null;
    
    @javax.inject.Inject
    public GameDetailRoomRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.room.GameDAO dao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getDetails(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.asimodabas.data.model.Detail>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object insertDetail(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.model.Detail detail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteDetail(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.model.Detail detail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}