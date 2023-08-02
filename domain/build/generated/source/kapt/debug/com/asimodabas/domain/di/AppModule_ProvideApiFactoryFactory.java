package com.asimodabas.domain.di;

import com.asimodabas.data.service.GameAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class AppModule_ProvideApiFactoryFactory implements Factory<GameAPI> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiFactoryFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public GameAPI get() {
    return provideApiFactory(retrofitProvider.get());
  }

  public static AppModule_ProvideApiFactoryFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiFactoryFactory(retrofitProvider);
  }

  public static GameAPI provideApiFactory(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiFactory(retrofit));
  }
}
