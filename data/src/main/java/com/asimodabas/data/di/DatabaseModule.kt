package com.asimodabas.data.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.asimodabas.domain.common.Constants.GAMES_DB_NAME
import com.asimodabas.domain.common.SharedPrefManager
import com.asimodabas.data.data.room.GameDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideFavDatabase(@ApplicationContext context: Context): GameDB {
        return Room.databaseBuilder(
            context, GameDB::class.java, GAMES_DB_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideFavDao(gameDb: GameDB) = gameDb.gameDao()

    @Singleton
    @Provides
    fun provideSharedPreferences(
        sharedPrefManager: com.asimodabas.domain.common.SharedPrefManager
    ): SharedPreferences = sharedPrefManager.getSharedPref()
}