package com.asimodabas.trendyol_interview.data.repository

import com.asimodabas.trendyol_interview.data.room.GameDAO
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.repository.GameDetailRoomRepository
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