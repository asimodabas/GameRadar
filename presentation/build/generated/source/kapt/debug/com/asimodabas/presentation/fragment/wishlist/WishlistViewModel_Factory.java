package com.asimodabas.presentation.fragment.wishlist;

import com.asimodabas.domain.usecase.get_details.GetDetailsUseCase;
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
public final class WishlistViewModel_Factory implements Factory<WishlistViewModel> {
  private final Provider<GetDetailsUseCase> getDetailsUseCaseProvider;

  public WishlistViewModel_Factory(Provider<GetDetailsUseCase> getDetailsUseCaseProvider) {
    this.getDetailsUseCaseProvider = getDetailsUseCaseProvider;
  }

  @Override
  public WishlistViewModel get() {
    return newInstance(getDetailsUseCaseProvider.get());
  }

  public static WishlistViewModel_Factory create(
      Provider<GetDetailsUseCase> getDetailsUseCaseProvider) {
    return new WishlistViewModel_Factory(getDetailsUseCaseProvider);
  }

  public static WishlistViewModel newInstance(GetDetailsUseCase getDetailsUseCase) {
    return new WishlistViewModel(getDetailsUseCase);
  }
}
