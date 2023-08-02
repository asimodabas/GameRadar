package com.asimodabas.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/asimodabas/domain/di/DatabaseModule;", "", "()V", "provideFavDao", "Lcom/asimodabas/data/room/GameDAO;", "gameDb", "Lcom/asimodabas/data/room/GameDB;", "provideFavDatabase", "context", "Landroid/content/Context;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "sharedPrefManager", "Lcom/asimodabas/domain/common/SharedPrefManager;", "domain_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.data.room.GameDB provideFavDatabase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.data.room.GameDAO provideFavDao(@org.jetbrains.annotations.NotNull
    com.asimodabas.data.room.GameDB gameDb) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.common.SharedPrefManager sharedPrefManager) {
        return null;
    }
}