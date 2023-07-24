package com.asimodabas.trendyol_interview.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.asimodabas.trendyol_interview.common.Constants.GAMES_DB_NAME
import com.asimodabas.trendyol_interview.common.SharedPrefManager
import com.asimodabas.trendyol_interview.data.room.GameDB
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
        sharedPrefManager: SharedPrefManager
    ): SharedPreferences = sharedPrefManager.getSharedPref()
}