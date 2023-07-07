package com.asimodabas.trendyol_interview.data.dto

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.google.gson.annotations.SerializedName

data class GameDTO(
    @SerializedName("results") val results: List<Detail>
)