package com.asimodabas.presentation

import androidx.annotation.VisibleForTesting
import com.asimodabas.domain.ui_model.DetailUiModel
import com.asimodabas.domain.ui_model.GenreUiModel
import com.asimodabas.domain.ui_model.PlatformUiModel
import com.asimodabas.domain.ui_model.PublisherUiModel

@VisibleForTesting
val topPublisherUi = PublisherUiModel(
    id = 1,
    name = "testName",
    imageBackground = "testBackground"
)

@VisibleForTesting
val topGenresUi = GenreUiModel(
    id = 1,
    name = "testName",
    imageBackground = "testBackground"
)

@VisibleForTesting
val firstPlatformUiModel = PlatformUiModel(
    id = 1,
    name = "firstTestName",
    slug = "firstTestSlug",
    isSelected = true
)

@VisibleForTesting
val secondPlatformUiModel = PlatformUiModel(
    id = 2,
    name = "secondTestName",
    slug = "secondTestSlug",
    isSelected = false
)


@VisibleForTesting
fun firstDetailUiModel(): DetailUiModel {
    return DetailUiModel(
        id = 1,
        name = "firstTestName",
        released = "firstTestReleased",
        playtime = "firstTestPlaytime",
        description = "firstTestDescription",
        reddit_url = "firstTestReddit",
        website = "firstTestWebsite",
        genres = topGenreUiList,
        publishers = topPublisherUiList,
        metacritic = 1,
        imageUrl = "firstTestImage",
        wishlist = true
    )
}

@VisibleForTesting
fun secondDetailUiModel(): DetailUiModel {
    return DetailUiModel(
        id = 2,
        name = "secondTestName",
        released = "secondTestReleased",
        playtime = "secondTestPlaytime",
        description = "secondTestDescription",
        reddit_url = "secondTestReddit",
        website = "secondTestWebsite",
        genres = topGenreUiList,
        publishers = topPublisherUiList,
        metacritic = 2,
        imageUrl = "secondTestImage",
        wishlist = true
    )
}


@VisibleForTesting
val topPublisherUiList = listOf(topPublisherUi)

@VisibleForTesting
val topGenreUiList = listOf(topGenresUi)

@VisibleForTesting
val mergeDetailUiModel = listOf(firstDetailUiModel(), secondDetailUiModel())
