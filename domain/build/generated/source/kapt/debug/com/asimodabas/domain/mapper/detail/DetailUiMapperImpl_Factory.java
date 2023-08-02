package com.asimodabas.domain.mapper.detail;

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
public final class DetailUiMapperImpl_Factory implements Factory<DetailUiMapperImpl> {
  private final Provider<GenreUiMapper> genreUiMapperProvider;

  private final Provider<PublisherUiMapper> publisherUiMapperProvider;

  public DetailUiMapperImpl_Factory(Provider<GenreUiMapper> genreUiMapperProvider,
      Provider<PublisherUiMapper> publisherUiMapperProvider) {
    this.genreUiMapperProvider = genreUiMapperProvider;
    this.publisherUiMapperProvider = publisherUiMapperProvider;
  }

  @Override
  public DetailUiMapperImpl get() {
    return newInstance(genreUiMapperProvider.get(), publisherUiMapperProvider.get());
  }

  public static DetailUiMapperImpl_Factory create(Provider<GenreUiMapper> genreUiMapperProvider,
      Provider<PublisherUiMapper> publisherUiMapperProvider) {
    return new DetailUiMapperImpl_Factory(genreUiMapperProvider, publisherUiMapperProvider);
  }

  public static DetailUiMapperImpl newInstance(GenreUiMapper genreUiMapper,
      PublisherUiMapper publisherUiMapper) {
    return new DetailUiMapperImpl(genreUiMapper, publisherUiMapper);
  }
}
