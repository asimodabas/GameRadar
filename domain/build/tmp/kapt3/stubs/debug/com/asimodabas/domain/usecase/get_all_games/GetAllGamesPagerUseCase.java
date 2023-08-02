package com.asimodabas.domain.usecase.get_all_games;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCase;", "", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "domain_debug"})
public abstract interface GetAllGamesPagerUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.asimodabas.domain.ui_model.GameUiModel>> invoke();
}