package com.asimodabas.domain.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/asimodabas/domain/common/SharedPrefManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMasterKey", "Landroidx/security/crypto/MasterKey;", "getSharedPref", "Landroid/content/SharedPreferences;", "domain_debug"})
public final class SharedPrefManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public SharedPrefManager(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    private final androidx.security.crypto.MasterKey getMasterKey() {
        return null;
    }
}