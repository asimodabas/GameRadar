package com.asimodabas.domain.mapper.detail;

import com.asimodabas.domain.mapper.genre.GenreMapper;
import com.asimodabas.domain.mapper.publisher.PublisherMapper;
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
public final class DetailMapperImpl_Factory implements Factory<DetailMapperImpl> {
  private final Provider<GenreMapper> genreMapperProvider;

  private final Provider<PublisherMapper> publisherMapperProvider;

  public DetailMapperImpl_Factory(Provider<GenreMapper> genreMapperProvider,
      Provider<PublisherMapper> publisherMapperProvider) {
    this.genreMapperProvider = genreMapperProvider;
    this.publisherMapperProvider = publisherMapperProvider;
  }

  @Override
  public DetailMapperImpl get() {
    return newInstance(genreMapperProvider.get(), publisherMapperProvider.get());
  }

  public static DetailMapperImpl_Factory create(Provider<GenreMapper> genreMapperProvider,
      Provider<PublisherMapper> publisherMapperProvider) {
    return new DetailMapperImpl_Factory(genreMapperProvider, publisherMapperProvider);
  }

  public static DetailMapperImpl newInstance(GenreMapper genreMapper,
      PublisherMapper publisherMapper) {
    return new DetailMapperImpl(genreMapper, publisherMapper);
  }
}
