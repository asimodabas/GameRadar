package com.asimodabas.domain.usecase.get_game_search;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6\u0002\u00a8\u0006\n"}, d2 = {"Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchPagerUseCase;", "", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "queryString", "", "getGameSearchUseCase", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCase;", "domain_debug"})
public abstract interface GetGameSearchPagerUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.asimodabas.domain.ui_model.GameUiModel>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String queryString, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase getGameSearchUseCase);
}