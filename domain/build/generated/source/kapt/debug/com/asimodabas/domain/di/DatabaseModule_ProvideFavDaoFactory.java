package com.asimodabas.domain.di;

import com.asimodabas.data.room.GameDAO;
import com.asimodabas.data.room.GameDB;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvideFavDaoFactory implements Factory<GameDAO> {
  private final DatabaseModule module;

  private final Provider<GameDB> gameDbProvider;

  public DatabaseModule_ProvideFavDaoFactory(DatabaseModule module,
      Provider<GameDB> gameDbProvider) {
    this.module = module;
    this.gameDbProvider = gameDbProvider;
  }

  @Override
  public GameDAO get() {
    return provideFavDao(module, gameDbProvider.get());
  }

  public static DatabaseModule_ProvideFavDaoFactory create(DatabaseModule module,
      Provider<GameDB> gameDbProvider) {
    return new DatabaseModule_ProvideFavDaoFactory(module, gameDbProvider);
  }

  public static GameDAO provideFavDao(DatabaseModule instance, GameDB gameDb) {
    return Preconditions.checkNotNullFromProvides(instance.provideFavDao(gameDb));
  }
}
