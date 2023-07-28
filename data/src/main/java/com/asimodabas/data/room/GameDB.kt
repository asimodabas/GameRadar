package com.asimodabas.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.asimodabas.data.model.Detail

@Database(entities = [Detail::class], version = 1)
abstract class GameDB : RoomDatabase() {

    abstract fun gameDao(): GameDAO
}