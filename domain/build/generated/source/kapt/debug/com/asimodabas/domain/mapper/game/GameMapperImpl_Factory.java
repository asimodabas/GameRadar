package com.asimodabas.domain.mapper.game;

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
public final class GameMapperImpl_Factory implements Factory<GameMapperImpl> {
  @Override
  public GameMapperImpl get() {
    return newInstance();
  }

  public static GameMapperImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GameMapperImpl newInstance() {
    return new GameMapperImpl();
  }

  private static final class InstanceHolder {
    private static final GameMapperImpl_Factory INSTANCE = new GameMapperImpl_Factory();
  }
}
