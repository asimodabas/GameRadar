package com.asimodabas.data.usecase.delete_detail

import com.asimodabas.domain.model.DetailLocal

interface DeleteDetailUseCase {
    suspend operator fun invoke(detail: DetailLocal)
}