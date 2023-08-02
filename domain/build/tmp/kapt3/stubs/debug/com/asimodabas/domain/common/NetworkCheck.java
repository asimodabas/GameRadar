package com.asimodabas.domain.common;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0011\u0012B+\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/asimodabas/domain/common/NetworkCheck;", "T", "", "data", "message", "", "networkError", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getNetworkError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Error", "Success", "Lcom/asimodabas/domain/common/NetworkCheck$Error;", "Lcom/asimodabas/domain/common/NetworkCheck$Success;", "domain_debug"})
public abstract class NetworkCheck<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final T data = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean networkError = null;
    
    private NetworkCheck(T data, java.lang.String message, java.lang.Boolean networkError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getNetworkError() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/asimodabas/domain/common/NetworkCheck$Error;", "T", "Lcom/asimodabas/domain/common/NetworkCheck;", "message", "", "networkError", "", "(Ljava/lang/String;Z)V", "domain_debug"})
    public static final class Error<T extends java.lang.Object> extends com.asimodabas.domain.common.NetworkCheck<T> {
        
        public Error(@org.jetbrains.annotations.Nullable
        java.lang.String message, boolean networkError) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/asimodabas/domain/common/NetworkCheck$Success;", "T", "Lcom/asimodabas/domain/common/NetworkCheck;", "data", "(Ljava/lang/Object;)V", "domain_debug"})
    public static final class Success<T extends java.lang.Object> extends com.asimodabas.domain.common.NetworkCheck<T> {
        
        public Success(T data) {
        }
    }
}