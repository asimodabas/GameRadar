package com.asimodabas.presentation.fragment.games;

import com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase;
import com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase;
import com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase;
import com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GamesViewModel_Factory implements Factory<GamesViewModel> {
  private final Provider<GetAllGamesPagerUseCase> getAllGamesPagerUseCaseProvider;

  private final Provider<GetGameSearchPagerUseCase> getGameSearchPagerUseCaseProvider;

  private final Provider<GetGameSearchUseCase> getGameSearchUseCaseProvider;

  private final Provider<GetPlatformsUseCase> getPlatformsUseCaseProvider;

  public GamesViewModel_Factory(Provider<GetAllGamesPagerUseCase> getAllGamesPagerUseCaseProvider,
      Provider<GetGameSearchPagerUseCase> getGameSearchPagerUseCaseProvider,
      Provider<GetGameSearchUseCase> getGameSearchUseCaseProvider,
      Provider<GetPlatformsUseCase> getPlatformsUseCaseProvider) {
    this.getAllGamesPagerUseCaseProvider = getAllGamesPagerUseCaseProvider;
    this.getGameSearchPagerUseCaseProvider = getGameSearchPagerUseCaseProvider;
    this.getGameSearchUseCaseProvider = getGameSearchUseCaseProvider;
    this.getPlatformsUseCaseProvider = getPlatformsUseCaseProvider;
  }

  @Override
  public GamesViewModel get() {
    return newInstance(getAllGamesPagerUseCaseProvider.get(), getGameSearchPagerUseCaseProvider.get(), getGameSearchUseCaseProvider.get(), getPlatformsUseCaseProvider.get());
  }

  public static GamesViewModel_Factory create(
      Provider<GetAllGamesPagerUseCase> getAllGamesPagerUseCaseProvider,
      Provider<GetGameSearchPagerUseCase> getGameSearchPagerUseCaseProvider,
      Provider<GetGameSearchUseCase> getGameSearchUseCaseProvider,
      Provider<GetPlatformsUseCase> getPlatformsUseCaseProvider) {
    return new GamesViewModel_Factory(getAllGamesPagerUseCaseProvider, getGameSearchPagerUseCaseProvider, getGameSearchUseCaseProvider, getPlatformsUseCaseProvider);
  }

  public static GamesViewModel newInstance(GetAllGamesPagerUseCase getAllGamesPagerUseCase,
      GetGameSearchPagerUseCase getGameSearchPagerUseCase,
      GetGameSearchUseCase getGameSearchUseCase, GetPlatformsUseCase getPlatformsUseCase) {
    return new GamesViewModel(getAllGamesPagerUseCase, getGameSearchPagerUseCase, getGameSearchUseCase, getPlatformsUseCase);
  }
}
