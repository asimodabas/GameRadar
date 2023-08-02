package com.asimodabas.domain.usecase.get_game_detail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/asimodabas/domain/usecase/get_game_detail/GetGameDetailUseCaseImpl;", "Lcom/asimodabas/domain/usecase/get_game_detail/GetGameDetailUseCase;", "gameDetailRepository", "Lcom/asimodabas/data/repository/game_detail/GameDetailRepository;", "detailUiMapper", "Lcom/asimodabas/domain/mapper/detail/DetailUiMapper;", "(Lcom/asimodabas/data/repository/game_detail/GameDetailRepository;Lcom/asimodabas/domain/mapper/detail/DetailUiMapper;)V", "invoke", "Lcom/asimodabas/domain/common/NetworkCheck;", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetGameDetailUseCaseImpl implements com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.data.repository.game_detail.GameDetailRepository gameDetailRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.detail.DetailUiMapper detailUiMapper = null;
    
    @javax.inject.Inject
    public GetGameDetailUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game_detail.GameDetailRepository gameDetailRepository, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.detail.DetailUiMapper detailUiMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.domain.common.NetworkCheck<com.asimodabas.domain.ui_model.DetailUiModel>> $completion) {
        return null;
    }
}