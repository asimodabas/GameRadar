package com.asimodabas.domain.usecase.get_all_games;

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
public final class GetAllGamesPagerUseCaseImpl_Factory implements Factory<GetAllGamesPagerUseCaseImpl> {
  private final Provider<GetAllGamesUseCase> getAllGamesUseCaseProvider;

  public GetAllGamesPagerUseCaseImpl_Factory(
      Provider<GetAllGamesUseCase> getAllGamesUseCaseProvider) {
    this.getAllGamesUseCaseProvider = getAllGamesUseCaseProvider;
  }

  @Override
  public GetAllGamesPagerUseCaseImpl get() {
    return newInstance(getAllGamesUseCaseProvider.get());
  }

  public static GetAllGamesPagerUseCaseImpl_Factory create(
      Provider<GetAllGamesUseCase> getAllGamesUseCaseProvider) {
    return new GetAllGamesPagerUseCaseImpl_Factory(getAllGamesUseCaseProvider);
  }

  public static GetAllGamesPagerUseCaseImpl newInstance(GetAllGamesUseCase getAllGamesUseCase) {
    return new GetAllGamesPagerUseCaseImpl(getAllGamesUseCase);
  }
}
