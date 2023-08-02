package com.asimodabas.domain.di;

import android.content.Context;
import com.asimodabas.data.room.GameDB;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideFavDatabaseFactory implements Factory<GameDB> {
  private final DatabaseModule module;

  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideFavDatabaseFactory(DatabaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public GameDB get() {
    return provideFavDatabase(module, contextProvider.get());
  }

  public static DatabaseModule_ProvideFavDatabaseFactory create(DatabaseModule module,
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideFavDatabaseFactory(module, contextProvider);
  }

  public static GameDB provideFavDatabase(DatabaseModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideFavDatabase(context));
  }
}
