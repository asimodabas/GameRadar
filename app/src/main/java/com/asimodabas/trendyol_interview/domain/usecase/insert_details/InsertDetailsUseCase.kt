package com.asimodabas.trendyol_interview.domain.usecase.insert_details

import com.asimodabas.trendyol_interview.domain.model.DetailLocal

interface InsertDetailsUseCase {
    suspend operator fun invoke(detail: DetailLocal)
}