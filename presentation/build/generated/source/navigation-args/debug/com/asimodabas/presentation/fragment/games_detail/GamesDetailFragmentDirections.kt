package com.asimodabas.presentation.fragment.games_detail

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.asimodabas.presentation.R

public class GamesDetailFragmentDirections private constructor() {
  public companion object {
    public fun actionGamesDetailFragmentToGamesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_gamesDetailFragment_to_gamesFragment)
  }
}
