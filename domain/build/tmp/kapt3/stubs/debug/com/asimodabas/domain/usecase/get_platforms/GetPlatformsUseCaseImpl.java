package com.asimodabas.domain.usecase.get_platforms;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCaseImpl;", "Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCase;", "gameRepository", "Lcom/asimodabas/data/repository/game/GameRepository;", "platformMapper", "Lcom/asimodabas/domain/mapper/platform/PlatformMapper;", "(Lcom/asimodabas/data/repository/game/GameRepository;Lcom/asimodabas/domain/mapper/platform/PlatformMapper;)V", "invoke", "Lcom/asimodabas/domain/common/NetworkCheck;", "", "Lcom/asimodabas/domain/ui_model/PlatformUiModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetPlatformsUseCaseImpl implements com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.data.repository.game.GameRepository gameRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.platform.PlatformMapper platformMapper = null;
    
    @javax.inject.Inject
    public GetPlatformsUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.repository.game.GameRepository gameRepository, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.platform.PlatformMapper platformMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.domain.common.NetworkCheck<java.util.List<com.asimodabas.domain.ui_model.PlatformUiModel>>> $completion) {
        return null;
    }
}