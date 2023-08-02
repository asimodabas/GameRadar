package com.asimodabas.domain.mapper.platform;

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
public final class PlatformMapperImpl_Factory implements Factory<PlatformMapperImpl> {
  @Override
  public PlatformMapperImpl get() {
    return newInstance();
  }

  public static PlatformMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PlatformMapperImpl newInstance() {
    return new PlatformMapperImpl();
  }

  private static final class InstanceHolder {
    private static final PlatformMapperImpl_Factory INSTANCE = new PlatformMapperImpl_Factory();
  }
}
