package com.asimodabas.domain.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import retrofit2.converter.gson.GsonConverterFactory;

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
public final class AppModule_ProvideConverterFactoryFactory implements Factory<GsonConverterFactory> {
  @Override
  public GsonConverterFactory get() {
    return provideConverterFactory();
  }

  public static AppModule_ProvideConverterFactoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GsonConverterFactory provideConverterFactory() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideConverterFactory());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideConverterFactoryFactory INSTANCE = new AppModule_ProvideConverterFactoryFactory();
  }
}
