package com.asimodabas.data.room;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/asimodabas/data/room/GameDAO;", "", "delete", "", "gameDetail", "Lcom/asimodabas/data/model/Detail;", "getDetail", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "data_debug"})
@androidx.room.Dao
public abstract interface GameDAO {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.model.Detail gameDetail);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.model.Detail gameDetail);
    
    @androidx.room.Query(value = "SELECT * FROM games")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetail(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.asimodabas.data.model.Detail>> $completion);
}