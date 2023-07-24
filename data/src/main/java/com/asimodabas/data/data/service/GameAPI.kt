package com.asimodabas.data.data.service

import com.asimodabas.data.data.dto.GameDTO
import com.asimodabas.data.data.dto.PlatformDTO
import com.asimodabas.domain.common.Constants.API_GAMES
import com.asimodabas.domain.common.Constants.API_GAMES_ID
import com.asimodabas.domain.common.Constants.API_KEY
import com.asimodabas.domain.common.Constants.API_PLATFORMS
import com.asimodabas.domain.model.Detail
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GameAPI {

    @GET(API_GAMES)
    suspend fun getAllData(
        @Query("page") nextPage: String,
        @Query("key") apiKey: String = API_KEY
    ): GameDTO

    @GET(API_GAMES)
    suspend fun getGameSearch(
        @Query("search") searchQuery: String,
        @Query("page") nextPage: String,
        @Query("key") apiKey: String = API_KEY
    ): GameDTO

    @GET(API_PLATFORMS)
    suspend fun getParentPlatform(
        @Query("key") apiKey: String = API_KEY
    ): PlatformDTO

    @GET(API_GAMES_ID)
    suspend fun getGameDetail(
        @Path("id") id: Int,
        @Query("key") apiKey: String = API_KEY
    ): Detail
}