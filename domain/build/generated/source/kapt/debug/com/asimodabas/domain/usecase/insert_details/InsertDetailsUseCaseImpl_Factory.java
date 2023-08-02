package com.asimodabas.domain.usecase.insert_details;

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
public final class InsertDetailsUseCaseImpl_Factory implements Factory<InsertDetailsUseCaseImpl> {
  private final Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider;

  private final Provider<DetailMapper> detailMapperProvider;

  public InsertDetailsUseCaseImpl_Factory(
      Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider,
      Provider<DetailMapper> detailMapperProvider) {
    this.gameDetailRoomRepositoryProvider = gameDetailRoomRepositoryProvider;
    this.detailMapperProvider = detailMapperProvider;
  }

  @Override
  public InsertDetailsUseCaseImpl get() {
    return newInstance(gameDetailRoomRepositoryProvider.get(), detailMapperProvider.get());
  }

  public static InsertDetailsUseCaseImpl_Factory create(
      Provider<GameDetailRoomRepository> gameDetailRoomRepositoryProvider,
      Provider<DetailMapper> detailMapperProvider) {
    return new InsertDetailsUseCaseImpl_Factory(gameDetailRoomRepositoryProvider, detailMapperProvider);
  }

  public static InsertDetailsUseCaseImpl newInstance(
      GameDetailRoomRepository gameDetailRoomRepository, DetailMapper detailMapper) {
    return new InsertDetailsUseCaseImpl(gameDetailRoomRepository, detailMapper);
  }
}
