package com.asimodabas.presentation.fragment.games_detail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class GamesDetailFragmentArgs(
  public val detailArgs: Int,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("detailArgs", this.detailArgs)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("detailArgs", this.detailArgs)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): GamesDetailFragmentArgs {
      bundle.setClassLoader(GamesDetailFragmentArgs::class.java.classLoader)
      val __detailArgs : Int
      if (bundle.containsKey("detailArgs")) {
        __detailArgs = bundle.getInt("detailArgs")
      } else {
        throw IllegalArgumentException("Required argument \"detailArgs\" is missing and does not have an android:defaultValue")
      }
      return GamesDetailFragmentArgs(__detailArgs)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): GamesDetailFragmentArgs {
      val __detailArgs : Int?
      if (savedStateHandle.contains("detailArgs")) {
        __detailArgs = savedStateHandle["detailArgs"]
        if (__detailArgs == null) {
          throw IllegalArgumentException("Argument \"detailArgs\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"detailArgs\" is missing and does not have an android:defaultValue")
      }
      return GamesDetailFragmentArgs(__detailArgs)
    }
  }
}
