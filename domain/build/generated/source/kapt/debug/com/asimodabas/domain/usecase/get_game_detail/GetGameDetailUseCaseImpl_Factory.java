package com.asimodabas.domain.usecase.get_game_detail;

import com.asimodabas.data.repository.game_detail.GameDetailRepository;
import com.asimodabas.domain.mapper.detail.DetailUiMapper;
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
public final class GetGameDetailUseCaseImpl_Factory implements Factory<GetGameDetailUseCaseImpl> {
  private final Provider<GameDetailRepository> gameDetailRepositoryProvider;

  private final Provider<DetailUiMapper> detailUiMapperProvider;

  public GetGameDetailUseCaseImpl_Factory(
      Provider<GameDetailRepository> gameDetailRepositoryProvider,
      Provider<DetailUiMapper> detailUiMapperProvider) {
    this.gameDetailRepositoryProvider = gameDetailRepositoryProvider;
    this.detailUiMapperProvider = detailUiMapperProvider;
  }

  @Override
  public GetGameDetailUseCaseImpl get() {
    return newInstance(gameDetailRepositoryProvider.get(), detailUiMapperProvider.get());
  }

  public static GetGameDetailUseCaseImpl_Factory create(
      Provider<GameDetailRepository> gameDetailRepositoryProvider,
      Provider<DetailUiMapper> detailUiMapperProvider) {
    return new GetGameDetailUseCaseImpl_Factory(gameDetailRepositoryProvider, detailUiMapperProvider);
  }

  public static GetGameDetailUseCaseImpl newInstance(GameDetailRepository gameDetailRepository,
      DetailUiMapper detailUiMapper) {
    return new GetGameDetailUseCaseImpl(gameDetailRepository, detailUiMapper);
  }
}
