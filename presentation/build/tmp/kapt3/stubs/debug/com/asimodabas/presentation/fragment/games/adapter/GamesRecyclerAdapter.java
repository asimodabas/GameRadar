package com.asimodabas.presentation.fragment.games.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/adapter/GamesRecyclerAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "Lcom/asimodabas/presentation/fragment/games/adapter/GamesRecyclerAdapter$GameViewHolder;", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "GameViewHolder", "presentation_debug"})
public final class GamesRecyclerAdapter extends androidx.paging.PagingDataAdapter<com.asimodabas.domain.ui_model.GameUiModel, com.asimodabas.presentation.fragment.games.adapter.GamesRecyclerAdapter.GameViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavController navController = null;
    @org.jetbrains.annotations.NotNull
    public static final com.asimodabas.presentation.fragment.games.adapter.GamesRecyclerAdapter.DiffCallback DiffCallback = null;
    
    public GamesRecyclerAdapter(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
        super(null, null, null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.asimodabas.presentation.fragment.games.adapter.GamesRecyclerAdapter.GameViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.asimodabas.presentation.fragment.games.adapter.GamesRecyclerAdapter.GameViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/adapter/GamesRecyclerAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "presentation_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.asimodabas.domain.ui_model.GameUiModel> {
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.asimodabas.domain.ui_model.GameUiModel oldItem, @org.jetbrains.annotations.NotNull
        com.asimodabas.domain.ui_model.GameUiModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.asimodabas.domain.ui_model.GameUiModel oldItem, @org.jetbrains.annotations.NotNull
        com.asimodabas.domain.ui_model.GameUiModel newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/adapter/GamesRecyclerAdapter$GameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/asimodabas/presentation/databinding/LayoutMainRowBinding;", "navController", "Landroidx/navigation/NavController;", "(Lcom/asimodabas/presentation/databinding/LayoutMainRowBinding;Landroidx/navigation/NavController;)V", "bind", "", "detail", "Lcom/asimodabas/domain/ui_model/GameUiModel;", "presentation_debug"})
    public static final class GameViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.asimodabas.presentation.databinding.LayoutMainRowBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.navigation.NavController navController = null;
        
        public GameViewHolder(@org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.databinding.LayoutMainRowBinding binding, @org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.asimodabas.domain.ui_model.GameUiModel detail) {
        }
    }
}