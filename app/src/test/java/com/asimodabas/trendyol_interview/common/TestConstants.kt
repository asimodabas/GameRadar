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
fun secondDetailShow(): Detail {
    return Detail(
        id = 2,
        name = "secondTestName",
        released = "secondTestReleased",
        playtime = "secondTestPlaytime",
        description = "secondTestDescription",
        reddit_url = "secondTestReddit",
        website = "secondTestWebsite",
        genres = topGenresList,
        publishers = topPublisherList,
        metacritic = 2,
        imageUrl = "secondTestImage",
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
val firstPlatformUiModel = PlatformUiModel(
    id = 1, name = "firstTestName",
    slug = "firstTestSlug"
)

@VisibleForTesting
val secondPlatformUiModel = PlatformUiModel(
    id = 2, name = "secondTestName",
    slug = "secondTestSlug"
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
val mergePlatformUiModel = listOf(firstPlatformUiModel, secondPlatformUiModel)

@VisibleForTesting
val topDetailList = listOf(firstDetailShow())

@VisibleForTesting
val topGameDTO = GameDTO(topDetailList)