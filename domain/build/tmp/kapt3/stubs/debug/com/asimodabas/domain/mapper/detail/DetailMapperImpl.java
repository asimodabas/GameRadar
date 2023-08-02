package com.asimodabas.domain.mapper.detail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/asimodabas/domain/mapper/detail/DetailMapperImpl;", "Lcom/asimodabas/domain/mapper/detail/DetailMapper;", "genreMapper", "Lcom/asimodabas/domain/mapper/genre/GenreMapper;", "publisherMapper", "Lcom/asimodabas/domain/mapper/publisher/PublisherMapper;", "(Lcom/asimodabas/domain/mapper/genre/GenreMapper;Lcom/asimodabas/domain/mapper/publisher/PublisherMapper;)V", "map", "Lcom/asimodabas/data/model/Detail;", "input", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "domain_debug"})
public final class DetailMapperImpl implements com.asimodabas.domain.mapper.detail.DetailMapper {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.genre.GenreMapper genreMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.mapper.publisher.PublisherMapper publisherMapper = null;
    
    @javax.inject.Inject
    public DetailMapperImpl(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.genre.GenreMapper genreMapper, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.publisher.PublisherMapper publisherMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.asimodabas.data.model.Detail map(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel input) {
        return null;
    }
}