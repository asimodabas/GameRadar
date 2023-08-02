package com.asimodabas.domain.mapper.game_detail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/asimodabas/domain/mapper/game_detail/GameDetailMapperImpl;", "Lcom/asimodabas/domain/mapper/game_detail/GameDetailMapper;", "genreUiMapper", "Lcom/asimodabas/domain/mapper/genre/GenreUiMapper;", "publisherUiMapper", "Lcom/asimodabas/domain/mapper/publisher/PublisherUiMapper;", "(Lcom/asimodabas/domain/mapper/genre/GenreUiMapper;Lcom/asimodabas/domain/mapper/publisher/PublisherUiMapper;)V", "map", "", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "input", "Lcom/asimodabas/data/model/Detail;", "domain_debug"})
public final class GameDetailMapperImpl implements com.asimodabas.domain.mapper.game_detail.GameDetailMapper {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.genre.GenreUiMapper genreUiMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.publisher.PublisherUiMapper publisherUiMapper = null;
    
    @javax.inject.Inject
    public GameDetailMapperImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.genre.GenreUiMapper genreUiMapper, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.publisher.PublisherUiMapper publisherUiMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.asimodabas.domain.ui_model.DetailUiModel> map(@org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Detail> input) {
        return null;
    }
}