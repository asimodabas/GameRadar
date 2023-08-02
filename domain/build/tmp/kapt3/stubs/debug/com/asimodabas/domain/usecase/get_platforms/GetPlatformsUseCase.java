package com.asimodabas.domain.usecase.get_platforms;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0003H\u00a6B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCase;", "", "invoke", "Lcom/asimodabas/domain/common/NetworkCheck;", "", "Lcom/asimodabas/domain/ui_model/PlatformUiModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface GetPlatformsUseCase {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.asimodabas.domain.common.NetworkCheck<java.util.List<com.asimodabas.domain.ui_model.PlatformUiModel>>> $completion);
}