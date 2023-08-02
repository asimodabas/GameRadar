package com.asimodabas.domain.usecase.get_game_search;

import com.asimodabas.data.repository.game.GameRepository;
import com.asimodabas.domain.mapper.game.GameMapper;
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
public final class GetGameSearchUseCaseImpl_Factory implements Factory<GetGameSearchUseCaseImpl> {
  private final Provider<GameRepository> gameRepositoryProvider;

  private final Provider<GameMapper> gameMapperProvider;

  public GetGameSearchUseCaseImpl_Factory(Provider<GameRepository> gameRepositoryProvider,
      Provider<GameMapper> gameMapperProvider) {
    this.gameRepositoryProvider = gameRepositoryProvider;
    this.gameMapperProvider = gameMapperProvider;
  }

  @Override
  public GetGameSearchUseCaseImpl get() {
    return newInstance(gameRepositoryProvider.get(), gameMapperProvider.get());
  }

  public static GetGameSearchUseCaseImpl_Factory create(
      Provider<GameRepository> gameRepositoryProvider, Provider<GameMapper> gameMapperProvider) {
    return new GetGameSearchUseCaseImpl_Factory(gameRepositoryProvider, gameMapperProvider);
  }

  public static GetGameSearchUseCaseImpl newInstance(GameRepository gameRepository,
      GameMapper gameMapper) {
    return new GetGameSearchUseCaseImpl(gameRepository, gameMapper);
  }
}
