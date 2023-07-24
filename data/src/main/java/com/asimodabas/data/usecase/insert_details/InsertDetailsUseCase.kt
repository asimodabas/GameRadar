package com.asimodabas.data.usecase.insert_details

import com.asimodabas.domain.model.DetailLocal

interface InsertDetailsUseCase {
    suspend operator fun invoke(detail: DetailLocal)
}