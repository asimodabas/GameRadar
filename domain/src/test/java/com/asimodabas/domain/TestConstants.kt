package com.asimodabas.domain

import androidx.annotation.VisibleForTesting
import com.asimodabas.data.dto.GameDTO
import com.asimodabas.data.model.Detail
import com.asimodabas.data.model.Genre
import com.asimodabas.data.model.Publisher
import com.asimodabas.domain.ui_model.DetailUiModel
import com.asimodabas.domain.ui_model.GameUiModel
import com.asimodabas.domain.ui_model.GenreUiModel
import com.asimodabas.domain.ui_model.PublisherUiModel

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
fun firstDetailUiShow(): DetailUiModel {
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
val topPublisherUi = PublisherUiModel(
    id = 1,
    name = "testName",
    imageBackground = "testBackground"
)

@VisibleForTesting
val topGenreUi = GenreUiModel(
    id = 1,
    name = "testName",
    imageBackground = "testBackground"
)

@VisibleForTesting
val topPublisher = Publisher(
    id = 1,
    name = "testName",
    imageBackground = "testBackground"
)

@VisibleForTesting
val topGenres = Genre(
    id = 1,
    name = "testName",
    imageBackground = "testBackground"
)

@VisibleForTesting
val firstGameUiModel = GameUiModel(
    id = 1,
    name = "firstTestName",
    imageUrl = "firstTestImage"
)

@VisibleForTesting
val secondGameUiModel = GameUiModel(
    id = 2,
    name = "secondTestName",
    imageUrl = "secondTestImage"
)

@VisibleForTesting
val topPublisherList = listOf(topPublisher)

@VisibleForTesting
val topPublisherUiList = listOf(topPublisherUi)

@VisibleForTesting
val topGenreUiList = listOf(topGenreUi)

@VisibleForTesting
val topGenresList = listOf(topGenres)

@VisibleForTesting
val mergeGameUiModel = listOf(firstGameUiModel, secondGameUiModel)

@VisibleForTesting
val topDetailList = listOf(firstDetailShow())

@VisibleForTesting
val topGameDTO = GameDTO(topDetailList)