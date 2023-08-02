package com.asimodabas.presentation.fragment.games

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.asimodabas.domain.common.NetworkCheck
import com.asimodabas.domain.state.DetailState
import com.asimodabas.domain.state.GameState
import com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase
import com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase
import com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase
import com.asimodabas.presentation.fragment.games.view.PlatformItemViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel @Inject constructor(
    private val getAllGamesPagerUseCase: GetAllGamesPagerUseCase,
    private val getGameSearchPagerUseCase: GetGameSearchPagerUseCase,
    private val getGameSearchUseCase: GetGameSearchUseCase,
    private val getPlatformsUseCase: GetPlatformsUseCase
) : ViewModel() {

    private val _gameState = MutableLiveData<GameState>()
    val gameState: LiveData<GameState> = _gameState

    private val _platformItemViewState = MutableLiveData<List<PlatformItemViewState>?>()
    val platformItemViewState: LiveData<List<PlatformItemViewState>?> = _platformItemViewState

    fun onPlatformItemClick(position: Int) = viewModelScope.launch {
        val platformItemViewStateList = _platformItemViewState.value ?: mutableListOf()
        val selectedPlatform = platformItemViewStateList.find { it.uiModel.isSelected }
        val selectedPlatformIndex = platformItemViewStateList.indexOf(selectedPlatform)

        if (selectedPlatformIndex == position) {
            selectedPlatform?.uiModel?.isSelected = false
            getGames()
        } else {
            selectedPlatform?.uiModel?.isSelected = false
            if (position >= 0 && position < platformItemViewStateList.size) {
                platformItemViewStateList[position].uiModel.isSelected = true
                getSearchGames(platformItemViewStateList[position].uiModel.name)
            }
        }
        _platformItemViewState.value = platformItemViewStateList
    }

    fun getGames() = viewModelScope.launch {
        getAllGamesPagerUseCase.invoke().cachedIn(this).collect { pagingData ->
            _gameState.postValue(GameState(success = pagingData))
        }
    }

    fun getSearchGames(searchQuery: String) = viewModelScope.launch {
        getGameSearchPagerUseCase.invoke(searchQuery, getGameSearchUseCase).cachedIn(this)
            .collect { pagingData ->
                _gameState.postValue(GameState(success = pagingData))
            }
    }

    fun getPlatforms() = viewModelScope.launch {
        when (val request = getPlatformsUseCase.invoke()) {
            is NetworkCheck.Success -> {
                _platformItemViewState.postValue(request.data?.let { data ->
                    data.map {
                        PlatformItemViewState(uiModel = it)
                    }
                })
            }

            is NetworkCheck.Error -> {
                DetailState(error = request.message)
            }
        }
    }
}