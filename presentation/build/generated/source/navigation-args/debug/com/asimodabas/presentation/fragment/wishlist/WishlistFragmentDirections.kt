package com.asimodabas.presentation.fragment.wishlist

import android.os.Bundle
import androidx.navigation.NavDirections
import com.asimodabas.presentation.R
import kotlin.Int

public class WishlistFragmentDirections private constructor() {
  private data class ActionWishlistFragmentToGamesDetailFragment(
    public val detailArgs: Int,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_wishlistFragment_to_gamesDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("detailArgs", this.detailArgs)
        return result
      }
  }

  public companion object {
    public fun actionWishlistFragmentToGamesDetailFragment(detailArgs: Int): NavDirections =
        ActionWishlistFragmentToGamesDetailFragment(detailArgs)
  }
}
