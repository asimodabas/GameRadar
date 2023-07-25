package com.asimodabas.data

import androidx.annotation.VisibleForTesting
import com.asimodabas.data.dto.GameDTO
import com.asimodabas.domain.model.Detail
import com.asimodabas.domain.model.DetailLocal
import com.asimodabas.domain.model.Genre
import com.asimodabas.domain.model.Publisher
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.domain.ui_model.WishlistUiModel

@VisibleForTesting
fun firstDetailShow(): Detail {
    return Detail(
        id = 1,
        name = "firstTestName",
        released = "firstTestReleased",
        playtime = "firstTestPlaytime",
        description = "firstTestDescription",
        reddit_url = "firstTestReddit",
        website = "firstTestWebsite",
        genres = topGenresList,
        publishers = topPublisherList,
        metacritic = 1,
        imageUrl = "firstTestImage",
        wishlist = true
    )
}

@VisibleForTesting
val topDetailLocal = DetailLocal(
    id = 1,
    name = "testName",
    released = "testReleased",
    playtime = "testPlaytime",
    description = "testDescription",
    reddit_url = "testReddit",
    website = "testWebsite",
    metacritic = 1,
    wishlist = true,
    background_image = "testBackground"
)

@VisibleForTesting
val topPublisher = Publisher(
    id = 1, name = "testName",
    slug = "testSlug",
    gamesCount = 1,
    imageBackground = "testBackground"
)

@VisibleForTesting
val topGenres = Genre(
    id = 1, name = "testName",
    slug = "testSlug",
    gamesCount = 1,
    imageBackground = "testBackground"
)

@VisibleForTesting
val firstWishlistUiModel = WishlistUiModel(
    id = 1,
    name = "firstTestName",
    released = "firstTestReleased",
    metacritic = 1,
    wishlist = true,
    background_image = "firstTestBackground"
)

@VisibleForTesting
val secondWishlistUiModel = WishlistUiModel(
    id = 2,
    name = "secondTestName",
    released = "secondTestReleased",
    metacritic = 2,
    wishlist = false,
    background_image = "secondTestBackground"
)

@VisibleForTesting
val firstGameUiModel = GameUiModel(
    id = 1,
    name = "firstTestName",
    imageUrl = "firstTestImage"
)

@VisibleForTesting
val secondGameUiModel = GameUiModel(
    id = 2, name = "secondTestName", imageUrl = "secondTestImage"
)

@VisibleForTesting
val topPublisherList = listOf(topPublisher)

@VisibleForTesting
val topGenresList = listOf(topGenres)

@VisibleForTesting
val mergeGameUiModel = listOf(firstGameUiModel, secondGameUiModel)

@VisibleForTesting
val mergeWishlistUiModel = listOf(firstWishlistUiModel, secondWishlistUiModel)

@VisibleForTesting
val topDetailList = listOf(firstDetailShow())

@VisibleForTesting
val topGameDTO = GameDTO(topDetailList)