package com.asimodabas.presentation.fragment.wishlist;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/asimodabas/presentation/fragment/wishlist/WishlistViewModel;", "Landroidx/lifecycle/ViewModel;", "getDetailsUseCase", "Lcom/asimodabas/domain/usecase/get_details/GetDetailsUseCase;", "(Lcom/asimodabas/domain/usecase/get_details/GetDetailsUseCase;)V", "_wishlistState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/asimodabas/domain/state/WishlistState;", "wishlistState", "Landroidx/lifecycle/LiveData;", "getWishlistState", "()Landroidx/lifecycle/LiveData;", "getWishlist", "Lkotlinx/coroutines/Job;", "presentation_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class WishlistViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.asimodabas.domain.usecase.get_details.GetDetailsUseCase getDetailsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.asimodabas.domain.state.WishlistState> _wishlistState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.asimodabas.domain.state.WishlistState> wishlistState = null;
    
    @javax.inject.Inject
    public WishlistViewModel(@org.jetbrains.annotations.NotNull
    com.asimodabas.domain.usecase.get_details.GetDetailsUseCase getDetailsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.asimodabas.domain.state.WishlistState> getWishlistState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getWishlist() {
        return null;
    }
}