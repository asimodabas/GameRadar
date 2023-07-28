package com.asimodabas.data.room

import androidx.room.*
import com.asimodabas.data.model.Detail

@Dao
interface GameDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(gameDetail: Detail)

    @Delete
    fun delete(gameDetail: Detail)

    @Query("SELECT * FROM games")
    suspend fun getDetail(): List<Detail>
}