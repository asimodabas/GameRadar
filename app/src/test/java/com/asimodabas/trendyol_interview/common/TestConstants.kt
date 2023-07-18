package com.asimodabas.trendyol_interview.common

import androidx.annotation.VisibleForTesting
import com.asimodabas.trendyol_interview.data.dto.GameDTO
import com.asimodabas.trendyol_interview.domain.model.Detail
import com.asimodabas.trendyol_interview.domain.model.DetailLocal
import com.asimodabas.trendyol_interview.domain.model.Genre
import com.asimodabas.trendyol_interview.domain.model.Publisher
import com.asimodabas.trendyol_interview.domain.model.ui_model.GameUiModel
import com.asimodabas.trendyol_interview.domain.model.ui_model.PlatformUiModel
import com.asimodabas.trendyol_interview.domain.model.ui_model.WishlistUiModel

@VisibleForTesting
fun createDetailShow(): Detail {
    return Detail(
        id = 1,
        name = "testName",
        released = "testReleased",
        playtime = "testPlaytime",
        description = "testDescription",
        reddit_url = "testReddit",
        website = "testWebsite",
        genres = topGenresList,
        publishers = topPublisherList,
        metacritic = 1,
        imageUrl = "testImage",
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
    id = 1, name = "testName", slug = "testSlug", gamesCount = 1, imageBackground = "testBackground"
)

@VisibleForTesting
val topGenres = Genre(
    id = 1, name = "testName", slug = "testSlug", gamesCount = 1, imageBackground = "testBackground"
)

@VisibleForTesting
val topGameUiModel = GameUiModel(
    id = 1, name = "testName", imageUrl = "testImage"
)

@VisibleForTesting
val firstPlatformUiModel = PlatformUiModel(
    id = 1, name = "firstTestName", slug = "firstTestSlug"
)

@VisibleForTesting
val secondPlatformUiModel = PlatformUiModel(
    id = 2, name = "secondTestName", slug = "secondTestSlug"
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
val topPublisherList = listOf(topPublisher)

@VisibleForTesting
val topGenresList = listOf(topGenres)

@VisibleForTesting
val topGameUiModelList = listOf(topGameUiModel)

@VisibleForTesting
val mergeWishlistUiModel = listOf(firstWishlistUiModel, secondWishlistUiModel)

@VisibleForTesting
val mergePlatformUiModel = listOf(firstPlatformUiModel, secondPlatformUiModel)

@VisibleForTesting
val topDetailList = listOf(createDetailShow())

@VisibleForTesting
val topGameDTO = GameDTO(topDetailList)