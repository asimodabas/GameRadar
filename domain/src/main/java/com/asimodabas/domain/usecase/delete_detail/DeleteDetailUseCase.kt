package com.asimodabas.domain.usecase.delete_detail

import com.asimodabas.domain.ui_model.DetailUiModel

interface DeleteDetailUseCase {
    suspend operator fun invoke(detail: DetailUiModel)
}