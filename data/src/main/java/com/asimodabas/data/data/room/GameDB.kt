package com.asimodabas.data.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.asimodabas.domain.model.DetailLocal

@Database(entities = [DetailLocal::class], version = 1)
abstract class GameDB : RoomDatabase() {

    abstract fun gameDao(): GameDAO
}