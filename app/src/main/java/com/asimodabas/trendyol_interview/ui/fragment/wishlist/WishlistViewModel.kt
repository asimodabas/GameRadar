package com.asimodabas.trendyol_interview.ui.fragment.wishlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.trendyol_interview.common.state.WishlistState
import com.asimodabas.trendyol_interview.domain.usecase.get_details.GetDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WishlistViewModel @Inject constructor(
    private val getDetailsUseCase: GetDetailsUseCase
) : ViewModel() {

    private val _wishlistState = MutableLiveData<WishlistState>()
    val wishlistState: LiveData<WishlistState> = _wishlistState

    fun getWishlist() = viewModelScope.launch {
        val request = getDetailsUseCase.invoke()
        _wishlistState.postValue(
            WishlistState(success = request)
        )
    }
}