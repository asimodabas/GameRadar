package com.asimodabas.presentation.fragment.games_detail

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.state.DetailState
import com.asimodabas.domain.ui_model.DetailUiModel
import com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase
import com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase
import com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase
import com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesDetailViewModel @Inject constructor(
    private val getGameDetailUseCase: GetGameDetailUseCase,
    private val insertDetailsUseCase: InsertDetailsUseCase,
    private val deleteDetailUseCase: DeleteDetailUseCase,
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

    fun checkWishlist(detail: DetailUiModel) = viewModelScope.launch {
        if (sharedPreferences.getBoolean(detail.name, false)) {

            _wishlistState.postValue(true)
            detail.wishlist = true
        } else {

            _wishlistState.postValue(false)
            detail.wishlist = false
        }
    }

    fun wishlistClickButton(detail: DetailUiModel) = viewModelScope.launch {
        if (detail.wishlist) {
            detail.wishlist = false
            _wishlistState.postValue(false)
            deleteWishList(detail)
            sharedPreferences.edit().remove(detail.name).apply()

        } else {
            detail.wishlist = true
            _wishlistState.postValue(true)
            addWishList(detail)
            sharedPreferences.edit().putBoolean(detail.name, true).apply()
        }
    }

    private fun addWishList(detail: DetailUiModel) = viewModelScope.launch {
        insertDetailsUseCase.invoke(detail)
    }

    private fun deleteWishList(detail: DetailUiModel) = viewModelScope.launch {
        deleteDetailUseCase.invoke(detail)
    }
}