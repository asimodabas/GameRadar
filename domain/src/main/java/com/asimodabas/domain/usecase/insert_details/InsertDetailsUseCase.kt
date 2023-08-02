package com.asimodabas.domain.usecase.insert_details

import com.asimodabas.domain.ui_model.DetailUiModel

interface InsertDetailsUseCase {
    suspend operator fun invoke(detail: DetailUiModel)
}