package com.asimodabas.trendyol_interview.data.service

import com.asimodabas.trendyol_interview.common.Constants.API_GAMES
import com.asimodabas.trendyol_interview.common.Constants.API_GAMES_ID
import com.asimodabas.trendyol_interview.common.Constants.API_KEY
import com.asimodabas.trendyol_interview.common.Constants.API_PLATFORMS
import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.data.dto.PlatformDTO
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.Platform
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GameAPI {

    @GET(API_GAMES)
    suspend fun getData(
        @Query("key") apiKey: String = API_KEY
    ): GameDTO

    @GET(API_GAMES)
    suspend fun getGameSearch(
        @Query("search") searchQuery: String,
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