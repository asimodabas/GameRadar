package com.asimodabas.data.data.room

import androidx.room.*
import com.asimodabas.domain.model.DetailLocal
import com.asimodabas.domain.ui_model.WishlistUiModel

@Dao
interface GameDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(gameDetail: DetailLocal)

    @Delete
    fun delete(gameDetail: DetailLocal)

    @Query("SELECT * FROM games")
    suspend fun getDetail(): List<WishlistUiModel>
}