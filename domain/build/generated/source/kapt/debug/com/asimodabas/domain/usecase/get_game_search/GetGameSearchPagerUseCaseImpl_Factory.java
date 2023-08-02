package com.asimodabas.domain.usecase.get_game_search;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class GetGameSearchPagerUseCaseImpl_Factory implements Factory<GetGameSearchPagerUseCaseImpl> {
  @Override
  public GetGameSearchPagerUseCaseImpl get() {
    return newInstance();
  }

  public static GetGameSearchPagerUseCaseImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GetGameSearchPagerUseCaseImpl newInstance() {
    return new GetGameSearchPagerUseCaseImpl();
  }

  private static final class InstanceHolder {
    private static final GetGameSearchPagerUseCaseImpl_Factory INSTANCE = new GetGameSearchPagerUseCaseImpl_Factory();
  }
}
