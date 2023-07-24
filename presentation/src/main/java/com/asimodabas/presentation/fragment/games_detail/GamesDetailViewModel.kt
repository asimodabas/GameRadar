package com.asimodabas.presentation.fragment.games_detail

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.data.data.mapper.detail_local.DetailLocalMapper
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.state.DetailState
import com.asimodabas.domain.model.Detail
import com.asimodabas.domain.model.DetailLocal
import com.asimodabas.data.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.data.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.data.usecase.insert_details.InsertDetailsUseCase
import com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesDetailViewModel @Inject constructor(
    private val getGameDetailUseCase: GetGameDetailUseCase,
    private val insertDetailsUseCase: InsertDetailsUseCase,
    private val deleteDetailUseCase: DeleteDetailUseCase,
    private val detailLocalMapper: DetailLocalMapper,
    private var sharedPreferences: SharedPreferences
) : ViewModel() {

    private val _gamesDetailViewState = MutableLiveData<GamesDetailViewState?>()
    val gamesDetailViewState: LiveData<GamesDetailViewState?> = _gamesDetailViewState

    private val _wishlistState = MutableLiveData<Boolean>()
    val wishlistState: LiveData<Boolean> = _wishlistState

    fun getDetail(id: Int) = viewModelScope.launch {
        when (val request = getGameDetailUseCase.invoke(id)) {
            is NetworkCheck.Success -> {
                _gamesDetailViewState.postValue(
                    request.data?.let { data ->
                        GamesDetailViewState(
                            data = data
                        )
                    }
                )
            }

            is NetworkCheck.Error -> {
                DetailState(error = request.message)
            }
        }
    }

    fun checkWishlist(detail: Detail) = viewModelScope.launch {
        if (sharedPreferences.getBoolean(detail.name, false)) {

            _wishlistState.postValue(true)
            detail.wishlist = true
        } else {

            _wishlistState.postValue(false)
            detail.wishlist = false
        }
    }

    fun wishlistClickButton(detail: Detail) = viewModelScope.launch {
        val detailLocal = detailLocalMapper.map(detail)
        if (detailLocal.wishlist) {
            detailLocal.wishlist = false
            _wishlistState.postValue(false)
            deleteWishList(detailLocal)
            sharedPreferences.edit().remove(detailLocal.name).apply()

        } else {
            detailLocal.wishlist = true
            _wishlistState.postValue(true)
            addWishList(detailLocal)
            sharedPreferences.edit().putBoolean(detailLocal.name, true).apply()
        }
    }

    private fun addWishList(detail: DetailLocal) = viewModelScope.launch {
        insertDetailsUseCase.invoke(detail)
    }

    private fun deleteWishList(detail: DetailLocal) = viewModelScope.launch {
        deleteDetailUseCase.invoke(detail)
    }
}