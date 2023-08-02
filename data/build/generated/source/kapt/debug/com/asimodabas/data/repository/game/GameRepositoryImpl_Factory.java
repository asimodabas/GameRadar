package com.asimodabas.data.repository.game;

import com.asimodabas.data.service.GameAPI;
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
public final class GameRepositoryImpl_Factory implements Factory<GameRepositoryImpl> {
  private final Provider<GameAPI> apiFactoryProvider;

  public GameRepositoryImpl_Factory(Provider<GameAPI> apiFactoryProvider) {
    this.apiFactoryProvider = apiFactoryProvider;
  }

  @Override
  public GameRepositoryImpl get() {
    return newInstance(apiFactoryProvider.get());
  }

  public static GameRepositoryImpl_Factory create(Provider<GameAPI> apiFactoryProvider) {
    return new GameRepositoryImpl_Factory(apiFactoryProvider);
  }

  public static GameRepositoryImpl newInstance(GameAPI apiFactory) {
    return new GameRepositoryImpl(apiFactory);
  }
}
