package com.asimodabas.domain.usecase.get_platforms;

import com.asimodabas.data.repository.game.GameRepository;
import com.asimodabas.domain.mapper.platform.PlatformMapper;
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
public final class GetPlatformsUseCaseImpl_Factory implements Factory<GetPlatformsUseCaseImpl> {
  private final Provider<GameRepository> gameRepositoryProvider;

  private final Provider<PlatformMapper> platformMapperProvider;

  public GetPlatformsUseCaseImpl_Factory(Provider<GameRepository> gameRepositoryProvider,
      Provider<PlatformMapper> platformMapperProvider) {
    this.gameRepositoryProvider = gameRepositoryProvider;
    this.platformMapperProvider = platformMapperProvider;
  }

  @Override
  public GetPlatformsUseCaseImpl get() {
    return newInstance(gameRepositoryProvider.get(), platformMapperProvider.get());
  }

  public static GetPlatformsUseCaseImpl_Factory create(
      Provider<GameRepository> gameRepositoryProvider,
      Provider<PlatformMapper> platformMapperProvider) {
    return new GetPlatformsUseCaseImpl_Factory(gameRepositoryProvider, platformMapperProvider);
  }

  public static GetPlatformsUseCaseImpl newInstance(GameRepository gameRepository,
      PlatformMapper platformMapper) {
    return new GetPlatformsUseCaseImpl(gameRepository, platformMapper);
  }
}
