package com.asimodabas.domain.usecase.get_all_games;

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
public final class GetAllGamesUseCaseImpl_Factory implements Factory<GetAllGamesUseCaseImpl> {
  private final Provider<GameRepository> gameRepositoryProvider;

  private final Provider<GameMapper> gameMapperProvider;

  public GetAllGamesUseCaseImpl_Factory(Provider<GameRepository> gameRepositoryProvider,
      Provider<GameMapper> gameMapperProvider) {
    this.gameRepositoryProvider = gameRepositoryProvider;
    this.gameMapperProvider = gameMapperProvider;
  }

  @Override
  public GetAllGamesUseCaseImpl get() {
    return newInstance(gameRepositoryProvider.get(), gameMapperProvider.get());
  }

  public static GetAllGamesUseCaseImpl_Factory create(
      Provider<GameRepository> gameRepositoryProvider, Provider<GameMapper> gameMapperProvider) {
    return new GetAllGamesUseCaseImpl_Factory(gameRepositoryProvider, gameMapperProvider);
  }

  public static GetAllGamesUseCaseImpl newInstance(GameRepository gameRepository,
      GameMapper gameMapper) {
    return new GetAllGamesUseCaseImpl(gameRepository, gameMapper);
  }
}
