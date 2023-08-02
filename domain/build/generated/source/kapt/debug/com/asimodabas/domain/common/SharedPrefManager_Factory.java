package com.asimodabas.domain.common;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPrefManager_Factory implements Factory<SharedPrefManager> {
  private final Provider<Context> contextProvider;

  public SharedPrefManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPrefManager get() {
    return newInstance(contextProvider.get());
  }

  public static SharedPrefManager_Factory create(Provider<Context> contextProvider) {
    return new SharedPrefManager_Factory(contextProvider);
  }

  public static SharedPrefManager newInstance(Context context) {
    return new SharedPrefManager(context);
  }
}
