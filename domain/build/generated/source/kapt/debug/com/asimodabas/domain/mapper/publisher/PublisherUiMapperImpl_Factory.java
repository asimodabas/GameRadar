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
public final class PublisherUiMapperImpl_Factory implements Factory<PublisherUiMapperImpl> {
  @Override
  public PublisherUiMapperImpl get() {
    return newInstance();
  }

  public static PublisherUiMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PublisherUiMapperImpl newInstance() {
    return new PublisherUiMapperImpl();
  }

  private static final class InstanceHolder {
    private static final PublisherUiMapperImpl_Factory INSTANCE = new PublisherUiMapperImpl_Factory();
  }
}
