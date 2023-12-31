package com.asimodabas.data.dto

import com.asimodabas.data.model.Detail
import com.google.gson.annotations.SerializedName

data class GameDTO(
    @SerializedName("results") val results: List<Detail>
)