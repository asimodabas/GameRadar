package com.asimodabas.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\'J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\'J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\'\u00a8\u0006\'"}, d2 = {"Lcom/asimodabas/domain/di/MapperModule;", "", "()V", "bindDetailLocalMapper", "Lcom/asimodabas/domain/mapper/detail/DetailUiMapper;", "detailLocalMapperImpl", "Lcom/asimodabas/domain/mapper/detail/DetailUiMapperImpl;", "bindDetailMapper", "Lcom/asimodabas/domain/mapper/detail/DetailMapper;", "detailMapperImpl", "Lcom/asimodabas/domain/mapper/detail/DetailMapperImpl;", "bindGameDetailLocalMapper", "Lcom/asimodabas/domain/mapper/game_detail/GameDetailMapper;", "gameDetailMapperImpl", "Lcom/asimodabas/domain/mapper/game_detail/GameDetailMapperImpl;", "bindGamesMapper", "Lcom/asimodabas/domain/mapper/game/GameMapper;", "gameMapperImpl", "Lcom/asimodabas/domain/mapper/game/GameMapperImpl;", "bindGenreMapper", "Lcom/asimodabas/domain/mapper/genre/GenreMapper;", "genreMapperImpl", "Lcom/asimodabas/domain/mapper/genre/GenreMapperImpl;", "bindGenreUiMapper", "Lcom/asimodabas/domain/mapper/genre/GenreUiMapper;", "genreUiMapperImpl", "Lcom/asimodabas/domain/mapper/genre/GenreUiMapperImpl;", "bindPlatformsMapper", "Lcom/asimodabas/domain/mapper/platform/PlatformMapper;", "platformMapperImpl", "Lcom/asimodabas/domain/mapper/platform/PlatformMapperImpl;", "bindPublisherMapper", "Lcom/asimodabas/domain/mapper/publisher/PublisherMapper;", "publisherMapperImpl", "Lcom/asimodabas/domain/mapper/publisher/PublisherMapperImpl;", "bindPublisherUiMapper", "Lcom/asimodabas/domain/mapper/publisher/PublisherUiMapper;", "publisherUiMapperImpl", "Lcom/asimodabas/domain/mapper/publisher/PublisherUiMapperImpl;", "domain_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public abstract class MapperModule {
    
    public MapperModule() {
        super();
    }
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.game.GameMapper bindGamesMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.game.GameMapperImpl gameMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.platform.PlatformMapper bindPlatformsMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.platform.PlatformMapperImpl platformMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.detail.DetailMapper bindDetailMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.detail.DetailMapperImpl detailMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.genre.GenreMapper bindGenreMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.genre.GenreMapperImpl genreMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.genre.GenreUiMapper bindGenreUiMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.genre.GenreUiMapperImpl genreUiMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.publisher.PublisherMapper bindPublisherMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.publisher.PublisherMapperImpl publisherMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.publisher.PublisherUiMapper bindPublisherUiMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.publisher.PublisherUiMapperImpl publisherUiMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.detail.DetailUiMapper bindDetailLocalMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.detail.DetailUiMapperImpl detailLocalMapperImpl);
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.asimodabas.domain.mapper.game_detail.GameDetailMapper bindGameDetailLocalMapper(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.mapper.game_detail.GameDetailMapperImpl gameDetailMapperImpl);
}