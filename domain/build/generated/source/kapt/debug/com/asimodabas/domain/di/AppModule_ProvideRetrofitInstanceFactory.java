package com.asimodabas.domain.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
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
public final class AppModule_ProvideRetrofitInstanceFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  public AppModule_ProvideRetrofitInstanceFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofitInstance(okHttpClientProvider.get(), gsonConverterFactoryProvider.get());
  }

  public static AppModule_ProvideRetrofitInstanceFactory create(
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider) {
    return new AppModule_ProvideRetrofitInstanceFactory(okHttpClientProvider, gsonConverterFactoryProvider);
  }

  public static Retrofit provideRetrofitInstance(OkHttpClient okHttpClient,
      GsonConverterFactory gsonConverterFactory) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofitInstance(okHttpClient, gsonConverterFactory));
  }
}
