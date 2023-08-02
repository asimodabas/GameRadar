package com.asimodabas.presentation.fragment.games_detail;

import android.content.SharedPreferences;
import com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase;
import com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase;
import com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase;
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
public final class GamesDetailViewModel_Factory implements Factory<GamesDetailViewModel> {
  private final Provider<GetGameDetailUseCase> getGameDetailUseCaseProvider;

  private final Provider<InsertDetailsUseCase> insertDetailsUseCaseProvider;

  private final Provider<DeleteDetailUseCase> deleteDetailUseCaseProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public GamesDetailViewModel_Factory(Provider<GetGameDetailUseCase> getGameDetailUseCaseProvider,
      Provider<InsertDetailsUseCase> insertDetailsUseCaseProvider,
      Provider<DeleteDetailUseCase> deleteDetailUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.getGameDetailUseCaseProvider = getGameDetailUseCaseProvider;
    this.insertDetailsUseCaseProvider = insertDetailsUseCaseProvider;
    this.deleteDetailUseCaseProvider = deleteDetailUseCaseProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public GamesDetailViewModel get() {
    return newInstance(getGameDetailUseCaseProvider.get(), insertDetailsUseCaseProvider.get(), deleteDetailUseCaseProvider.get(), sharedPreferencesProvider.get());
  }

  public static GamesDetailViewModel_Factory create(
      Provider<GetGameDetailUseCase> getGameDetailUseCaseProvider,
      Provider<InsertDetailsUseCase> insertDetailsUseCaseProvider,
      Provider<DeleteDetailUseCase> deleteDetailUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new GamesDetailViewModel_Factory(getGameDetailUseCaseProvider, insertDetailsUseCaseProvider, deleteDetailUseCaseProvider, sharedPreferencesProvider);
  }

  public static GamesDetailViewModel newInstance(GetGameDetailUseCase getGameDetailUseCase,
      InsertDetailsUseCase insertDetailsUseCase, DeleteDetailUseCase deleteDetailUseCase,
      SharedPreferences sharedPreferences) {
    return new GamesDetailViewModel(getGameDetailUseCase, insertDetailsUseCase, deleteDetailUseCase, sharedPreferences);
  }
}
