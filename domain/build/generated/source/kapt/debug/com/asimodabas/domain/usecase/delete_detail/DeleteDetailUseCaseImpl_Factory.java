package com.asimodabas.domain.usecase.delete_detail;

import com.asimodabas.data.repository.game_detail_room.GameDetailRoomRepository;
import com.asimodabas.domain.mapper.detail.DetailMapper;
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
public final class DeleteDetailUseCaseImpl_Factory implements Factory<DeleteDetailUseCaseImpl> {
  private final Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider;

  private final Provider<DetailMapper> detailMapperProvider;

  public DeleteDetailUseCaseImpl_Factory(
      Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider,
      Provider<DetailMapper> detailMapperProvider) {
    this.gameDetailRoomRepositoryProvider = gameDetailRoomRepositoryProvider;
    this.detailMapperProvider = detailMapperProvider;
  }

  @Override
  public DeleteDetailUseCaseImpl get() {
    return newInstance(gameDetailRoomRepositoryProvider.get(), detailMapperProvider.get());
  }

  public static DeleteDetailUseCaseImpl_Factory create(
      Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider,
      Provider<DetailMapper> detailMapperProvider) {
    return new DeleteDetailUseCaseImpl_Factory(gameDetailRoomRepositoryProvider, detailMapperProvider);
  }

  public static DeleteDetailUseCaseImpl newInstance(
      GameDetailRoomRepository gameDetailRoomRepository, DetailMapper detailMapper) {
    return new DeleteDetailUseCaseImpl(gameDetailRoomRepository, detailMapper);
  }
}
