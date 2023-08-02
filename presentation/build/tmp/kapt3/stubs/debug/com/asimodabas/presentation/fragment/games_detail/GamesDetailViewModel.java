package com.asimodabas.presentation.fragment.games_detail;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/asimodabas/presentation/fragment/games_detail/GamesDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getGameDetailUseCase", "Lcom/asimodabas/domain/usecase/get_game_detail/GetGameDetailUseCase;", "insertDetailsUseCase", "Lcom/asimodabas/domain/usecase/insert_details/InsertDetailsUseCase;", "deleteDetailUseCase", "Lcom/asimodabas/domain/usecase/delete_detail/DeleteDetailUseCase;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/asimodabas/domain/usecase/get_game_detail/GetGameDetailUseCase;Lcom/asimodabas/domain/usecase/insert_details/InsertDetailsUseCase;Lcom/asimodabas/domain/usecase/delete_detail/DeleteDetailUseCase;Landroid/content/SharedPreferences;)V", "_gamesDetailViewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/asimodabas/presentation/fragment/games_detail/view/state/GamesDetailViewState;", "_wishlistState", "", "gamesDetailViewState", "Landroidx/lifecycle/LiveData;", "getGamesDetailViewState", "()Landroidx/lifecycle/LiveData;", "wishlistState", "getWishlistState", "addWishList", "Lkotlinx/coroutines/Job;", "detail", "Lcom/asimodabas/domain/ui_model/DetailUiModel;", "checkWishlist", "deleteWishList", "getDetail", "id", "", "wishlistClickButton", "presentation_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class GamesDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase getGameDetailUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase insertDetailsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase deleteDetailUseCase = null;
    @org.jetbrains.annotations.NotNull
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState> _gamesDetailViewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState> gamesDetailViewState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _wishlistState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> wishlistState = null;
    
    @javax.inject.Inject
    public GamesDetailViewModel(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_game_detail.GetGameDetailUseCase getGameDetailUseCase, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.insert_details.InsertDetailsUseCase insertDetailsUseCase, @org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.delete_detail.DeleteDetailUseCase deleteDetailUseCase, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.asimodabas.presentation.fragment.games_detail.view.state.GamesDetailViewState> getGamesDetailViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getWishlistState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getDetail(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job checkWishlist(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel detail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job wishlistClickButton(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.ui_model.DetailUiModel detail) {
        return null;
    }
    
    private final kotlinx.coroutines.Job addWishList(com.asimodabas.domain.ui_model.DetailUiModel detail) {
        return null;
    }
    
    private final kotlinx.coroutines.Job deleteWishList(com.asimodabas.domain.ui_model.DetailUiModel detail) {
        return null;
    }
}