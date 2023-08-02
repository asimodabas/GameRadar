package com.asimodabas.domain.mapper.game_detail;

import com.asimodabas.domain.mapper.genre.GenreUiMapper;
import com.asimodabas.domain.mapper.publisher.PublisherUiMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GameDetailMapperImpl_Factory implements Factory<GameDetailMapperImpl> {
  private final Provider<GenreUiMapper> genreUiMapperProvider;

  private final Provider<PublisherUiMapper> publisherUiMapperProvider;

  public GameDetailMapperImpl_Factory(Provider<GenreUiMapper> genreUiMapperProvider,
      Provider<PublisherUiMapper> publisherUiMapperProvider) {
    this.genreUiMapperProvider = genreUiMapperProvider;
    this.publisherUiMapperProvider = publisherUiMapperProvider;
  }

  @Override
  public GameDetailMapperImpl get() {
    return newInstance(genreUiMapperProvider.get(), publisherUiMapperProvider.get());
  }

  public static GameDetailMapperImpl_Factory create(Provider<GenreUiMapper> genreUiMapperProvider,
      Provider<PublisherUiMapper> publisherUiMapperProvider) {
    return new GameDetailMapperImpl_Factory(genreUiMapperProvider, publisherUiMapperProvider);
  }

  public static GameDetailMapperImpl newInstance(GenreUiMapper genreUiMapper,
      PublisherUiMapper publisherUiMapper) {
    return new GameDetailMapperImpl(genreUiMapper, publisherUiMapper);
  }
}
