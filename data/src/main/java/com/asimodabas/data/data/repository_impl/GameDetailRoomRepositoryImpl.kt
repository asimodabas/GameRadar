package com.asimodabas.data.data.repository_impl

import com.asimodabas.data.data.repository.GameDetailRoomRepository
import com.asimodabas.data.data.room.GameDAO
import com.asimodabas.domain.model.DetailLocal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GameDetailRoomRepositoryImpl @Inject constructor(
    private val dao: GameDAO
) : GameDetailRoomRepository {
    override suspend fun getDetails() = withContext(Dispatchers.IO) {
        dao.getDetail()
    }

    override suspend fun insertDetail(detail: DetailLocal) = withContext(Dispatchers.IO) {
        dao.insert(detail)
    }

    override suspend fun deleteDetail(detail: DetailLocal) = withContext(Dispatchers.IO) {
        dao.delete(detail)
    }
}