package com.asimodabas.domain.di;

import android.content.SharedPreferences;
import com.asimodabas.domain.common.SharedPrefManager;
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
public final class DatabaseModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final DatabaseModule module;

  private final Provider<SharedPrefManager> sharedPrefManagerProvider;

  public DatabaseModule_ProvideSharedPreferencesFactory(DatabaseModule module,
      Provider<SharedPrefManager> sharedPrefManagerProvider) {
    this.module = module;
    this.sharedPrefManagerProvider = sharedPrefManagerProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(module, sharedPrefManagerProvider.get());
  }

  public static DatabaseModule_ProvideSharedPreferencesFactory create(DatabaseModule module,
      Provider<SharedPrefManager> sharedPrefManagerProvider) {
    return new DatabaseModule_ProvideSharedPreferencesFactory(module, sharedPrefManagerProvider);
  }

  public static SharedPreferences provideSharedPreferences(DatabaseModule instance,
      SharedPrefManager sharedPrefManager) {
    return Preconditions.checkNotNullFromProvides(instance.provideSharedPreferences(sharedPrefManager));
  }
}
