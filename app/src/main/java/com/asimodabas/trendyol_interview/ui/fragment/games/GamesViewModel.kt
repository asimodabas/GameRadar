package com.asimodabas.trendyol_interview.ui.fragment.games

import android.net.Network
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.state.GameState
import com.asimodabas.trendyol_interview.common.state.PlatformState
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_platforms.GetPlatformsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel @Inject constructor(
    private val getAllGamesUseCase: GetAllGamesUseCase,
    private val getGameSearchUseCase: GetGameSearchUseCase,
    private val getPlatformsUseCase: GetPlatformsUseCase
) : ViewModel() {

    private val _gameState = MutableLiveData<GameState>()
    val gameState: LiveData<GameState> = _gameState

    private val _platformsState = MutableLiveData<PlatformState>()
    val platformsState: LiveData<PlatformState> = _platformsState

    init {
        getGames()
    }

    private fun getGames() {
        viewModelScope.launch {
            when (val request = getAllGamesUseCase.invoke()) {
                is NetworkCheck.Success -> {
                    _gameState.postValue(
                        GameState(
                            success = request.data
                        )
                    )
                }

                is NetworkCheck.Error -> {
                    _gameState.postValue(
                        GameState(
                            error = request.message
                        )
                    )
                }
            }
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

    fun getSearchGames(searchQuers: String) {
        viewModelScope.launch {
            when (val request = getGameSearchUseCase.invoke(searchQuers)) {
                is NetworkCheck.Success -> {
                    _gameState.postValue(
                        GameState(
                            success = request.data
                        )
                    )
                }

                is NetworkCheck.Error -> {
                    _gameState.postValue(
                        GameState(
                            error = request.message
                        )
                    )
                }
            }
        }
    }
}