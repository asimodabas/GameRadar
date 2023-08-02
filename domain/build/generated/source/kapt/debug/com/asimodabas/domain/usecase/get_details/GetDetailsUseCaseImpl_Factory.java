package com.asimodabas.domain.usecase.get_details;

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository;
import com.asimodabas.domain.mapper.game_detail.GameDetailMapper;
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
public final class GetDetailsUseCaseImpl_Factory implements Factory<GetDetailsUseCaseImpl> {
  private final Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider;

  private final Provider<GameDetailMapper> gameDetailMapperProvider;

  public GetDetailsUseCaseImpl_Factory(
      Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider,
      Provider<GameDetailMapper> gameDetailMapperProvider) {
    this.gameDetailRoomRepositoryProvider = gameDetailRoomRepositoryProvider;
    this.gameDetailMapperProvider = gameDetailMapperProvider;
  }

  @Override
  public GetDetailsUseCaseImpl get() {
    return newInstance(gameDetailRoomRepositoryProvider.get(), gameDetailMapperProvider.get());
  }

  public static GetDetailsUseCaseImpl_Factory create(
      Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider,
      Provider<GameDetailMapper> gameDetailMapperProvider) {
    return new GetDetailsUseCaseImpl_Factory(gameDetailRoomRepositoryProvider, gameDetailMapperProvider);
  }

  public static GetDetailsUseCaseImpl newInstance(GameDetailRoomRepository gameDetailRoomRepository,
      GameDetailMapper gameDetailMapper) {
    return new GetDetailsUseCaseImpl(gameDetailRoomRepository, gameDetailMapper);
  }
}
