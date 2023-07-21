package com.asimodabas.trendyol_interview.ui.fragment.games

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.state.GameState
import com.asimodabas.trendyol_interview.common.state.PlatformState
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesPagerUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchPagerUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_platforms.GetPlatformsUseCase
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

    private val _platformsState = MutableLiveData<PlatformState>()
    val platformsState: LiveData<PlatformState> = _platformsState

    fun getGames() = viewModelScope.launch {
        getAllGamesPagerUseCase.invoke().cachedIn(this)
            .collect { pagingData ->
                _gameState.postValue(GameState(success = pagingData))
            }
    }

    fun getSearchGames(searchQuery: String) = viewModelScope.launch {
        getGameSearchPagerUseCase.invoke(searchQuery, getGameSearchUseCase).cachedIn(this)
            .collect { pagingData ->
                _gameState.postValue(GameState(success = pagingData))
            }
    }

    fun getPlatforms() {
        viewModelScope.launch {
            when (val request = getPlatformsUseCase.invoke()) {
                is NetworkCheck.Success -> {
                    _platformsState.postValue(
                        PlatformState(
                            success = request.data
                        )
                    )
                }

                is NetworkCheck.Error -> {
                    _platformsState.postValue(
                        PlatformState(
                            error = request.message
                        )
                    )
                }
            }
        }
    }
}