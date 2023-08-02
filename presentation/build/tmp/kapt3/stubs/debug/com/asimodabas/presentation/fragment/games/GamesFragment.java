package com.asimodabas.presentation.fragment.games;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/GamesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/asimodabas/presentation/databinding/FragmentGamesBinding;", "getBinding", "()Lcom/asimodabas/presentation/databinding/FragmentGamesBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "gamesRecyclerAdapter", "Lcom/asimodabas/presentation/fragment/games/adapter/GamesRecyclerAdapter;", "platformsRecyclerAdapter", "Lcom/asimodabas/presentation/fragment/games/adapter/PlatformsRecyclerAdapter;", "viewModel", "Lcom/asimodabas/presentation/fragment/games/GamesViewModel;", "getViewModel", "()Lcom/asimodabas/presentation/fragment/games/GamesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "observeGameData", "", "observePlatformData", "observeSelectedPlatformData", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "searchQuery", "setupRv", "Landroidx/recyclerview/widget/RecyclerView;", "presentation_debug"})
public final class GamesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.properties.ReadOnlyProperty binding$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.asimodabas.presentation.fragment.games.adapter.GamesRecyclerAdapter gamesRecyclerAdapter;
    private com.asimodabas.presentation.fragment.games.adapter.PlatformsRecyclerAdapter platformsRecyclerAdapter;
    
    public GamesFragment() {
        super();
    }
    
    private final com.asimodabas.presentation.databinding.FragmentGamesBinding getBinding() {
        return null;
    }
    
    private final com.asimodabas.presentation.fragment.games.GamesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchQuery() {
    }
    
    private final void observeGameData() {
    }
    
    private final void observePlatformData() {
    }
    
    private final void observeSelectedPlatformData() {
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupRv() {
        return null;
    }
}