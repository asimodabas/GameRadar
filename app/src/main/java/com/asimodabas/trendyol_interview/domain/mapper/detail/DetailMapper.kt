package com.asimodabas.trendyol_interview.domain.mapper.detail

import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal

interface DetailMapper {
    fun map(input: DetailLocal) : Detail
}