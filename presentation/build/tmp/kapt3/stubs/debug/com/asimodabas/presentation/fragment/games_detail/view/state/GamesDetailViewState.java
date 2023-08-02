package com.asimodabas.presentation.fragment.games_detail.view.state;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u000eJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010 \u001a\u00020\u000eJ\b\u0010!\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\"\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010$\u001a\u00020\u000eH\u00d6\u0001J\u0006\u0010%\u001a\u00020\u000eJ\t\u0010&\u001a\u00020\u0011H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\'"}, d2 = {"Lcom/asimodabas/presentation/fragment/games_detail/view/state/GamesDetailViewState;", "", "data", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "(Lcom/asimodabas/domain/ui_model/DetailUiModel;)V", "getData", "()Lcom/asimodabas/domain/ui_model/DetailUiModel;", "setData", "component1", "copy", "equals", "", "other", "genreIsVisible", "", "getDescriptionIsVisible", "getDescriptionTextView", "", "getGameNameIsVisible", "getGameNameTextView", "getGenreTextView", "getMetacriticIsVisible", "getMetacriticTextView", "getMetacriticTextViewBackground", "getMetacriticTextViewColor", "context", "Landroid/content/Context;", "getPlaytimeIsVisible", "getPlaytimeTextView", "getPublisherTextView", "getRedditIsVisible", "getRedditTextView", "getReleasedIsVisible", "getReleasedTextView", "getWebsiteIsVisible", "getWebsiteTextView", "hashCode", "publisherIsVisible", "toString", "presentation_debug"})
public final class GamesDetailViewState {
    @org.jetbrains.annotations.NotNull
    private com.asimodabas.domain.ui_model.DetailUiModel data;
    
    public GamesDetailViewState(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.domain.ui_model.DetailUiModel getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel p0) {
    }
    
    public final int publisherIsVisible() {
        return 0;
    }
    
    public final int genreIsVisible() {
        return 0;
    }
    
    public final int getGameNameIsVisible() {
        return 0;
    }
    
    public final int getPlaytimeIsVisible() {
        return 0;
    }
    
    public final int getDescriptionIsVisible() {
        return 0;
    }
    
    public final int getReleasedIsVisible() {
        return 0;
    }
    
    public final int getWebsiteIsVisible() {
        return 0;
    }
    
    public final int getRedditIsVisible() {
        return 0;
    }
    
    public final int getMetacriticIsVisible() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescriptionTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMetacriticTextView() {
        return null;
    }
    
    public final int getMetacriticTextViewBackground() {
        return 0;
    }
    
    public final int getMetacriticTextViewColor(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlaytimeTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGameNameTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleasedTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebsiteTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRedditTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublisherTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGenreTextView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.domain.ui_model.DetailUiModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState copy(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel data) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}