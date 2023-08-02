package com.asimodabas.presentation.fragment.games.adapter;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0010\u001a\u00020\u000b2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0016R7\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/adapter/PlatformsRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/asimodabas/presentation/fragment/games/view/PlatformItemViewState;", "Lcom/asimodabas/presentation/fragment/games/adapter/PlatformsRecyclerAdapter$PlatformViewHolder;", "()V", "platformListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "getPlatformListener", "()Lkotlin/jvm/functions/Function1;", "setPlatformListener", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "PlatformViewHolder", "presentation_debug"})
public final class PlatformsRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.asimodabas.presentation.fragment.games.view.PlatformItemViewState, com.asimodabas.presentation.fragment.games.adapter.PlatformsRecyclerAdapter.PlatformViewHolder> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> platformListener;
    @org.jetbrains.annotations.NotNull
    public static final com.asimodabas.presentation.fragment.games.adapter.PlatformsRecyclerAdapter.DiffCallback DiffCallback = null;
    
    public PlatformsRecyclerAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getPlatformListener() {
        return null;
    }
    
    public final void setPlatformListener(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.asimodabas.presentation.fragment.games.adapter.PlatformsRecyclerAdapter.PlatformViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.asimodabas.presentation.fragment.games.adapter.PlatformsRecyclerAdapter.PlatformViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/adapter/PlatformsRecyclerAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/asimodabas/presentation/fragment/games/view/PlatformItemViewState;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "presentation_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.asimodabas.presentation.fragment.games.view.PlatformItemViewState> {
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.fragment.games.view.PlatformItemViewState oldItem, @org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.fragment.games.view.PlatformItemViewState newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.fragment.games.view.PlatformItemViewState oldItem, @org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.fragment.games.view.PlatformItemViewState newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/asimodabas/presentation/fragment/games/adapter/PlatformsRecyclerAdapter$PlatformViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/asimodabas/presentation/databinding/LayoutPlatformRowBinding;", "(Lcom/asimodabas/presentation/fragment/games/adapter/PlatformsRecyclerAdapter;Lcom/asimodabas/presentation/databinding/LayoutPlatformRowBinding;)V", "bind", "", "platformItemViewState", "Lcom/asimodabas/presentation/fragment/games/view/PlatformItemViewState;", "presentation_debug"})
    public final class PlatformViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.asimodabas.presentation.databinding.LayoutPlatformRowBinding binding = null;
        
        public PlatformViewHolder(@org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.databinding.LayoutPlatformRowBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.asimodabas.presentation.fragment.games.view.PlatformItemViewState platformItemViewState) {
        }
    }
}