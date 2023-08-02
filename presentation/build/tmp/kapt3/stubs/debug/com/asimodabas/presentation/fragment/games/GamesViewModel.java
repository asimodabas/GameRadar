package com.asimodabas.presentation.fragment.games;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/asimodabas/presentation/fragment/games/GamesViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllGamesPagerUseCase", "Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCase;", "getGameSearchPagerUseCase", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchPagerUseCase;", "getGameSearchUseCase", "Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCase;", "getPlatformsUseCase", "Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCase;", "(Lcom/asimodabas/domain/usecase/get_all_games/GetAllGamesPagerUseCase;Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchPagerUseCase;Lcom/asimodabas/domain/usecase/get_game_search/GetGameSearchUseCase;Lcom/asimodabas/domain/usecase/get_platforms/GetPlatformsUseCase;)V", "_gameState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/asimodabas/domain/state/GameState;", "_platformItemViewState", "", "Lcom/asimodabas/presentation/fragment/games/view/PlatformItemViewState;", "gameState", "Landroidx/lifecycle/LiveData;", "getGameState", "()Landroidx/lifecycle/LiveData;", "platformItemViewState", "getPlatformItemViewState", "getGames", "Lkotlinx/coroutines/Job;", "getPlatforms", "getSearchGames", "searchQuery", "", "onPlatformItemClick", "position", "", "presentation_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class GamesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase getAllGamesPagerUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase getGameSearchPagerUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase getGameSearchUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase getPlatformsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.asimodabas.domain.state.GameState> _gameState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.asimodabas.domain.state.GameState> gameState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.asimodabas.presentation.fragment.games.view.PlatformItemViewState>> _platformItemViewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.asimodabas.presentation.fragment.games.view.PlatformItemViewState>> platformItemViewState = null;
    
    @javax.inject.Inject
    public GamesViewModel(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_all_games.GetAllGamesPagerUseCase getAllGamesPagerUseCase, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_search.GetGameSearchPagerUseCase getGameSearchPagerUseCase, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_search.GetGameSearchUseCase getGameSearchUseCase, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_platforms.GetPlatformsUseCase getPlatformsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.asimodabas.domain.state.GameState> getGameState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.asimodabas.presentation.fragment.games.view.PlatformItemViewState>> getPlatformItemViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job onPlatformItemClick(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getGames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getSearchGames(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getPlatforms() {
        return null;
    }
}