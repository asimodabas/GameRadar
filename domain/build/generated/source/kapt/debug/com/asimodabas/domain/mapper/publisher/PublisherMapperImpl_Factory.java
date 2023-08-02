package com.asimodabas.domain.mapper.publisher;

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
public final class PublisherMapperImpl_Factory implements Factory<PublisherMapperImpl> {
  @Override
  public PublisherMapperImpl get() {
    return newInstance();
  }

  public static PublisherMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PublisherMapperImpl newInstance() {
    return new PublisherMapperImpl();
  }

  private static final class InstanceHolder {
    private static final PublisherMapperImpl_Factory INSTANCE = new PublisherMapperImpl_Factory();
  }
}
