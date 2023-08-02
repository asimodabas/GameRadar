package com.asimodabas.domain.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

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
public final class AppModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideHttpClient();
  }

  public static AppModule_ProvideHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideHttpClient() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideHttpClient());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideHttpClientFactory INSTANCE = new AppModule_ProvideHttpClientFactory();
  }
}
