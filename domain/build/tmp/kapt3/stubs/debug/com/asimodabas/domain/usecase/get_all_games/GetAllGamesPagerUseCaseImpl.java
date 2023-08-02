package com.asimodabas.domain.usecase.get_all_games;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCaseImpl;", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCase;", "getAllGamesUseCase", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesUseCase;", "(Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesUseCase;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "domain_debug"})
public final class GetAllGamesPagerUseCaseImpl implements com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCase getAllGamesUseCase = null;
    
    @javax.inject.Inject
    public GetAllGamesPagerUseCaseImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_all_games.GetAllGamesUseCase getAllGamesUseCase) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.asimodabas.domain.ui_model.GameUiModel>> invoke() {
        return null;
    }
}