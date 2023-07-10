package com.asimodabas.trendyol_interview.ui.fragment.games_detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.state.DetailState
import com.asimodabas.trendyol_interview.domain.mapper.detail_local.DetailLocalMapper
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.trendyol_interview.domain.usecase.insert_details.InsertDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesDetailViewModel @Inject constructor(
    private val getGameDetailUseCase: GetGameDetailUseCase,
    private val insertDetailsUseCase: InsertDetailsUseCase,
    private val deleteDetailUseCase: DeleteDetailUseCase,
    private val detailLocalMapper: DetailLocalMapper
) : ViewModel() {

    private val _detailState = MutableLiveData<DetailState>()
    val detailState: LiveData<DetailState> = _detailState

    fun getDetail(id: Int) = viewModelScope.launch {
        when (val request = getGameDetailUseCase.invoke(id)) {
            is NetworkCheck.Success -> {
                _detailState.postValue(
                    DetailState(
                        success = request.data
                    )
                )
            }

            is NetworkCheck.Error -> {
                DetailState(error = request.message)
            }
        }
    }

    fun addWishList(detail: DetailLocal) = viewModelScope.launch {
        insertDetailsUseCase.invoke(detail)
    }

    fun deleteWishList(detail: DetailLocal) = viewModelScope.launch {
        deleteDetailUseCase.invoke(detail)
    }

    fun detailToDetailLocal(detail: Detail) = detailLocalMapper.map(detail)
}