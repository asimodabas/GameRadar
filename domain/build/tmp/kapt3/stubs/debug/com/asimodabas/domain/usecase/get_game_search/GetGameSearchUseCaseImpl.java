package com.asimodabas.domain.usecase.get_game_search;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCaseImpl;", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCase;", "gameRepository", "Lcom/asimodabas/data/repository/game/GameRepository;", "gameMapper", "Lcom/asimodabas/domain/mapper/game/GameMapper;", "(Lcom/asimodabas/data/repository/game/GameRepository;Lcom/asimodabas/domain/mapper/game/GameMapper;)V", "invoke", "Lcom/asimodabas/domain/common/NetworkCheck;", "", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "searchQuery", "", "nextPage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetGameSearchUseCaseImpl implements com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.data.repository.game.GameRepository gameRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.game.GameMapper gameMapper = null;
    
    @javax.inject.Inject
    public GetGameSearchUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game.GameRepository gameRepository, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.game.GameMapper gameMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull
    java.lang.String nextPage, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.domain.common.NetworkCheck<java.util.List<com.asimodabas.domain.ui_model.GameUiModel>>> $completion) {
        return null;
    }
}