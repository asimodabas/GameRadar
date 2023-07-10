package com.asimodabas.trendyol_interview.domain.mapper.detail_local

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal

interface DetailLocalMapper {
    fun map(input: Detail): DetailLocal
}