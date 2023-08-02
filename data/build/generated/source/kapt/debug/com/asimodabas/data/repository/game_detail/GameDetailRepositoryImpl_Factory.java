package com.asimodabas.data.repository.game_detail;

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
public final class GameDetailRepositoryImpl_Factory implements Factory<GameDetailRepositoryImpl> {
  private final Provider<GameAPI> apiFactoryProvider;

  public GameDetailRepositoryImpl_Factory(Provider<GameAPI> apiFactoryProvider) {
    this.apiFactoryProvider = apiFactoryProvider;
  }

  @Override
  public GameDetailRepositoryImpl get() {
    return newInstance(apiFactoryProvider.get());
  }

  public static GameDetailRepositoryImpl_Factory create(Provider<GameAPI> apiFactoryProvider) {
    return new GameDetailRepositoryImpl_Factory(apiFactoryProvider);
  }

  public static GameDetailRepositoryImpl newInstance(GameAPI apiFactory) {
    return new GameDetailRepositoryImpl(apiFactory);
  }
}
