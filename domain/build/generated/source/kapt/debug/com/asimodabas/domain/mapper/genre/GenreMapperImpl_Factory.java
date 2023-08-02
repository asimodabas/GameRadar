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
public final class GenreMapperImpl_Factory implements Factory<GenreMapperImpl> {
  @Override
  public GenreMapperImpl get() {
    return newInstance();
  }

  public static GenreMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GenreMapperImpl newInstance() {
    return new GenreMapperImpl();
  }

  private static final class InstanceHolder {
    private static final GenreMapperImpl_Factory INSTANCE = new GenreMapperImpl_Factory();
  }
}
