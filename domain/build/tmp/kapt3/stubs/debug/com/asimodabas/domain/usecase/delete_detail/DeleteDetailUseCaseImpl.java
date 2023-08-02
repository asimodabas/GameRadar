package com.asimodabas.domain.usecase.delete_detail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/asimodabas/domain/usecase/delete_detail/DeleteDetailUseCaseImpl;", "Lcom/asimodabas/domain/usecase/delete_detail/DeleteDetailUseCase;", "gameDetailRoomRepository", "Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepository;", "detailMapper", "Lcom/asimodabas/domain/mapper/detail/DetailMapper;", "(Lcom/asimodabas/data/repository/game_detail_room/GameDetailRoomRepository;Lcom/asimodabas/domain/mapper/detail/DetailMapper;)V", "invoke", "", "detail", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "(Lcom/asimodabas/domain/ui_model/DetailUiModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class DeleteDetailUseCaseImpl implements com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository gameDetailRoomRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.detail.DetailMapper detailMapper = null;
    
    @javax.inject.Inject
    public DeleteDetailUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository gameDetailRoomRepository, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.detail.DetailMapper detailMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel detail, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}