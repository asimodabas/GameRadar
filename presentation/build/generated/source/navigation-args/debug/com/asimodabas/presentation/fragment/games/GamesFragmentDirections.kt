package com.asimodabas.presentation.fragment.games

import android.os.Bundle
import androidx.navigation.NavDirections
import com.asimodabas.presentation.R
import kotlin.Int

public class GamesFragmentDirections private constructor() {
  private data class ActionGamesFragmentToGamesDetailFragment(
    public val detailArgs: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_gamesFragment_to_gamesDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("detailArgs", this.detailArgs)
        return result
      }
  }

  public companion object {
    public fun actionGamesFragmentToGamesDetailFragment(detailArgs: Int): NavDirections =
        ActionGamesFragmentToGamesDetailFragment(detailArgs)
  }
}
