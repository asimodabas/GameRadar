package com.asimodabas.trendyol_interview.domain.usecase.get_game_detail

import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.domain.model.Detail

interface GetGameDetailUseCase {
     suspend operator fun invoke(id: Int): NetworkCheck<Detail>
}