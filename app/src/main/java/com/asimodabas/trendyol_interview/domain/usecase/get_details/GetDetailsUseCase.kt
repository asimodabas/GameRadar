package com.asimodabas.trendyol_interview.domain.usecase.get_details

import com.asimodabas.trendyol_interview.domain.model.ui_model.WishlistUiModel

interface GetDetailsUseCase {
    suspend operator fun invoke(): List<WishlistUiModel>
}