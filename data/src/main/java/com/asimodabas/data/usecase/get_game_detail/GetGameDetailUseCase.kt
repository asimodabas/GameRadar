package com.asimodabas.data.usecase.get_game_detail

import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.model.Detail

interface GetGameDetailUseCase {
     suspend operator fun invoke(id: Int): NetworkCheck<Detail>
}