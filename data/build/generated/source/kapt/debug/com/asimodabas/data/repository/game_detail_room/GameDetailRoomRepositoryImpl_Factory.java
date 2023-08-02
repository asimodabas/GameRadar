package com.asimodabas.data.repository.game_detail_room;

import com.asimodabas.data.room.GameDAO;
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
public final class GameDetailRoomRepositoryImpl_Factory implements Factory<GameDetailRoomRepositoryImpl> {
  private final Provider<GameDAO> daoProvider;

  public GameDetailRoomRepositoryImpl_Factory(Provider<GameDAO> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public GameDetailRoomRepositoryImpl get() {
    return newInstance(daoProvider.get());
  }

  public static GameDetailRoomRepositoryImpl_Factory create(Provider<GameDAO> daoProvider) {
    return new GameDetailRoomRepositoryImpl_Factory(daoProvider);
  }

  public static GameDetailRoomRepositoryImpl newInstance(GameDAO dao) {
    return new GameDetailRoomRepositoryImpl(dao);
  }
}
