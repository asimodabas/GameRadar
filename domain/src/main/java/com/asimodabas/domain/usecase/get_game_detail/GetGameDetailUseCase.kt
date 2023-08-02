package com.asimodabas.domain.usecase.get_game_detail

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.ui_model.DetailUiModel

interface GetGameDetailUseCase {
     suspend operator fun invoke(id: Int): NetworkCheck<DetailUiModel>
}