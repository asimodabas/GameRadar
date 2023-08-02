package com.asimodabas.presentation.fragment.wishlist;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/asimodabas/presentation/fragment/wishlist/WishlistFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/asimodabas/presentation/databinding/FragmentWishlistBinding;", "getBinding", "()Lcom/asimodabas/presentation/databinding/FragmentWishlistBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewModel", "Lcom/asimodabas/presentation/fragment/wishlist/WishlistViewModel;", "getViewModel", "()Lcom/asimodabas/presentation/fragment/wishlist/WishlistViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "wishlistRecyclerAdapter", "Lcom/asimodabas/presentation/fragment/wishlist/adapter/WishlistRecyclerAdapter;", "observeWishlistData", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupWishlistRv", "presentation_debug"})
public final class WishlistFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadOnlyProperty binding$delegate = null;
    private com.asimodabas.presentation.fragment.wishlist.adapter.WishlistRecyclerAdapter wishlistRecyclerAdapter;
    
    public WishlistFragment() {
        super();
    }
    
    private final com.asimodabas.presentation.fragment.wishlist.WishlistViewModel getViewModel() {
        return null;
    }
    
    private final com.asimodabas.presentation.databinding.FragmentWishlistBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeWishlistData() {
    }
    
    private final void setupWishlistRv() {
    }
}