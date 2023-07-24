package com.asimodabas.data.usecase.get_details

import com.asimodabas.domain.ui_model.WishlistUiModel

interface GetDetailsUseCase {
    suspend operator fun invoke(): List<WishlistUiModel>
}