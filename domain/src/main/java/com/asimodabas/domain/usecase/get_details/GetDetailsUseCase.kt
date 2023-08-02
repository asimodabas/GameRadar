package com.asimodabas.domain.usecase.get_details

import com.asimodabas.domain.ui_model.DetailUiModel

interface GetDetailsUseCase {
    suspend operator fun invoke(): List<DetailUiModel>
}