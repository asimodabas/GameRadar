package com.asimodabas.domain.mapper.genre;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class GenreUiMapperImpl_Factory implements Factory<GenreUiMapperImpl> {
  @Override
  public GenreUiMapperImpl get() {
    return newInstance();
  }

  public static GenreUiMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GenreUiMapperImpl newInstance() {
    return new GenreUiMapperImpl();
  }

  private static final class InstanceHolder {
    private static final GenreUiMapperImpl_Factory INSTANCE = new GenreUiMapperImpl_Factory();
  }
}
