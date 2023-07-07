package com.asimodabas.trendyol_interview.ui.fragment.games

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.asimodabas.trendyol_interview.common.NetworkCheck
import com.asimodabas.trendyol_interview.common.state.GetGameState
import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.domain.usecase.get_all_games.GetAllGamesUseCase
import com.asimodabas.trendyol_interview.domain.usecase.get_game_search.GetGameSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GamesViewModel
@Inject constructor(
    private val getAllGamesUseCase: GetAllGamesUseCase,
    private val GetGameSearchUseCase: GetGameSearchUseCase
) : ViewModel() {

    private val _gameState = MutableLiveData<GetGameState>()
    val gameState: LiveData<GetGameState> = _gameState

    init {
        getGames()
    }

    private fun getGames() {
        viewModelScope.launch {
            when (val request = getAllGamesUseCase.invoke()) {
                is NetworkCheck.Success -> {
                    _gameState.postValue(
                        GetGameState(
                            success = GameDTO(request.data?.results.orEmpty())
                        )
                    )
                }

                is NetworkCheck.Error -> {
                    _gameState.postValue(
                        GetGameState(
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
                        GetGameState(
                            success = GameDTO(request.data?.results.orEmpty())
                        )
                    )
                }

                is NetworkCheck.Error -> {
                    _gameState.postValue(
                        GetGameState(
                            error = request.message
                        )
                    )
                }
            }
        }
    }
}