package com.asimodabas.presentation

import android.widget.ImageView

fun formatMetacritic(metaCritic: Int?): Pair<Int, Int>? {
    if (metaCritic == null) {
        return null
    }

    var backgroundResource = 0
    var textColor = 0

    when (metaCritic) {
        in 1..49 -> {
            backgroundResource = R.drawable.bg_red_mc
            textColor = R.color.red
        }

        in 50..75 -> {
            backgroundResource = R.drawable.bg_yellow_mc
            textColor = R.color.yellow
        }

        in 76..101 -> {
            backgroundResource = R.drawable.bg_green_mc
            textColor = R.color.green
        }
    }

    return backgroundResource to textColor
}

fun formatWishlist(
    state: Boolean,
    ivAddWishList: ImageView
) {
    if (state) {
        ivAddWishList.setImageResource(R.drawable.ic_wishlist_select)
    } else {
        ivAddWishList.setImageResource(R.drawable.ic_wishlist)
    }
}