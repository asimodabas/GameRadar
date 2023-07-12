package com.asimodabas.trendyol_interview.ui.fragment.games

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.state.GameState
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel @Inject constructor(
    private val getAllGamesUseCase: GetAllGamesUseCase,
    private val GetGameSearchUseCase: GetGameSearchUseCase,
) : ViewModel() {

    private val _gameState = MutableLiveData<GameState>()
    val gameState: LiveData<GameState> = _gameState

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

    fun getSearchGames(searchQuers: String) {
        viewModelScope.launch {
            when (val request = GetGameSearchUseCase.invoke(searchQuers)) {
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