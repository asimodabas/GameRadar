package com.asimodabas.domain.mapper.game_detail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/asimodabas/domain/mapper/game_detail/GameDetailMapper;", "", "map", "", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "input", "Lcom/asimodabas/data/model/Detail;", "domain_debug"})
public abstract interface GameDetailMapper {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.asimodabas.domain.ui_model.DetailUiModel> map(@org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Detail> input);
}