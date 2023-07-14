package com.asimodabas.trendyol_interview.domain.usecase.delete_detail

import com.asimodabas.trendyol_interview.domain.model.DetailLocal

interface DeleteDetailUseCase {
    suspend operator fun invoke(detail: DetailLocal)
}