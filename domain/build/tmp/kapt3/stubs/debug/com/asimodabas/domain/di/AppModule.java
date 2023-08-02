package com.asimodabas.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\n \f*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/asimodabas/domain/di/AppModule;", "", "()V", "provideApiFactory", "Lcom/asimodabas/data/service/GameAPI;", "retrofit", "Lretrofit2/Retrofit;", "provideConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofitInstance", "kotlin.jvm.PlatformType", "okHttpClient", "gsonConverterFactory", "domain_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.asimodabas.domain.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.converter.gson.GsonConverterFactory provideConverterFactory() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofitInstance(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.data.service.GameAPI provideApiFactory(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}