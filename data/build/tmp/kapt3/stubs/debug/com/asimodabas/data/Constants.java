package com.asimodabas.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/asimodabas/data/Constants;", "", "()V", "API_GAMES", "", "API_GAMES_ID", "API_KEY", "API_PLATFORMS", "BASE_URL", "GAMES_DB_NAME", "PAGER_INITIAL_LOAD_SIZE", "", "PAGER_PAGE_SIZE", "PAGER_PLACE_HOLDER_STATE", "", "PAGER_PREFETCH_DISTANCE_SIZE", "data_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://api.rawg.io/api/";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_KEY = "2a70524831ad4231b1e7e0af05915bcd";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_GAMES = "games";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_PLATFORMS = "platforms";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String API_GAMES_ID = "games/{id}";
    public static final int PAGER_PAGE_SIZE = 10;
    public static final int PAGER_INITIAL_LOAD_SIZE = 10;
    public static final int PAGER_PREFETCH_DISTANCE_SIZE = 5;
    public static final boolean PAGER_PLACE_HOLDER_STATE = false;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GAMES_DB_NAME = "gamedb";
    @org.jetbrains.annotations.NotNull
    public static final com.asimodabas.data.Constants INSTANCE = null;
    
    private Constants() {
        super();
    }
}