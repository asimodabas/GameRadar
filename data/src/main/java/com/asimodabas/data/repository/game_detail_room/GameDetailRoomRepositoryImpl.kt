package com.asimodabas.data.repository.game_detail_room

import com.asimodabas.data.model.Detail
import com.asimodabas.data.room.GameDAO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GameDetailRoomRepositoryImpl @Inject constructor(
    private val dao: GameDAO
) : GameDetailRoomRepository {
    override suspend fun getDetails() = withContext(Dispatchers.IO) {
        dao.getDetail()
    }

    override suspend fun insertDetail(detail: Detail) = withContext(Dispatchers.IO) {
        dao.insert(detail)
    }

    override suspend fun deleteDetail(detail: Detail) = withContext(Dispatchers.IO) {
        dao.delete(detail)
    }
}