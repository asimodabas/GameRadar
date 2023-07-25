package com.asimodabas.data.mapper.detail_local

import com.asimodabas.domain.model.Detail
import com.asimodabas.domain.model.DetailLocal

interface DetailLocalMapper {
    fun map(input: Detail): DetailLocal
}