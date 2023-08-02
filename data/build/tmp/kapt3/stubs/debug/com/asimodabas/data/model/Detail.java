package com.asimodabas.data.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0013H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u00c6\u0003J\u00a2\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00132\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b\'\u0010\u0018R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006G"}, d2 = {"Lcom/asimodabas/data/model/Detail;", "", "id", "", "name", "", "released", "playtime", "description", "reddit_url", "website", "genres", "", "Lcom/asimodabas/data/model/Genre;", "publishers", "Lcom/asimodabas/data/model/Publisher;", "metacritic", "imageUrl", "wishlist", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getGenres", "()Ljava/util/List;", "getId", "()I", "setId", "(I)V", "getImageUrl", "setImageUrl", "getMetacritic", "()Ljava/lang/Integer;", "setMetacritic", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "setName", "getPlaytime", "setPlaytime", "getPublishers", "getReddit_url", "setReddit_url", "getReleased", "setReleased", "getWebsite", "setWebsite", "getWishlist", "()Z", "setWishlist", "(Z)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/asimodabas/data/model/Detail;", "equals", "other", "hashCode", "toString", "data_debug"})
@androidx.room.Entity(tableName = "games")
public final class Detail {
    @com.google.gson.annotations.SerializedName(value = "id")
    @androidx.room.PrimaryKey
    private int id;
    @com.google.gson.annotations.SerializedName(value = "name")
    @org.jetbrains.annotations.Nullable
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "released")
    @org.jetbrains.annotations.Nullable
    private java.lang.String released;
    @com.google.gson.annotations.SerializedName(value = "playtime")
    @org.jetbrains.annotations.Nullable
    private java.lang.String playtime;
    @com.google.gson.annotations.SerializedName(value = "description")
    @org.jetbrains.annotations.Nullable
    private java.lang.String description;
    @com.google.gson.annotations.SerializedName(value = "reddit_url")
    @org.jetbrains.annotations.Nullable
    private java.lang.String reddit_url;
    @com.google.gson.annotations.SerializedName(value = "website")
    @org.jetbrains.annotations.Nullable
    private java.lang.String website;
    @com.google.gson.annotations.SerializedName(value = "genres")
    @androidx.room.Ignore
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.asimodabas.data.model.Genre> genres = null;
    @com.google.gson.annotations.SerializedName(value = "publishers")
    @androidx.room.Ignore
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.asimodabas.data.model.Publisher> publishers = null;
    @com.google.gson.annotations.SerializedName(value = "metacritic")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer metacritic;
    @com.google.gson.annotations.SerializedName(value = "background_image")
    @org.jetbrains.annotations.Nullable
    private java.lang.String imageUrl;
    @com.google.gson.annotations.SerializedName(value = "wishlist")
    private boolean wishlist;
    
    @kotlin.jvm.JvmOverloads
    public Detail(int id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.String playtime, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String reddit_url, @org.jetbrains.annotations.Nullable
    java.lang.String website, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Genre> genres, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Publisher> publishers, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String imageUrl, boolean wishlist) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReleased() {
        return null;
    }
    
    public final void setReleased(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlaytime() {
        return null;
    }
    
    public final void setPlaytime(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReddit_url() {
        return null;
    }
    
    public final void setReddit_url(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWebsite() {
        return null;
    }
    
    public final void setWebsite(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.asimodabas.data.model.Genre> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.asimodabas.data.model.Publisher> getPublishers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMetacritic() {
        return null;
    }
    
    public final void setMetacritic(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean getWishlist() {
        return false;
    }
    
    public final void setWishlist(boolean p0) {
    }
    
    @kotlin.jvm.JvmOverloads
    public Detail(int id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.String playtime, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String reddit_url, @org.jetbrains.annotations.Nullable
    java.lang.String website, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String imageUrl) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Detail(int id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.String playtime, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String reddit_url, @org.jetbrains.annotations.Nullable
    java.lang.String website, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Genre> genres, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String imageUrl) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public Detail(int id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.String playtime, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String reddit_url, @org.jetbrains.annotations.Nullable
    java.lang.String website, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Genre> genres, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Publisher> publishers, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String imageUrl) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.asimodabas.data.model.Genre> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.asimodabas.data.model.Publisher> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.asimodabas.data.model.Detail copy(int id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.String playtime, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String reddit_url, @org.jetbrains.annotations.Nullable
    java.lang.String website, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Genre> genres, @org.jetbrains.annotations.NotNull
    java.util.List<com.asimodabas.data.model.Publisher> publishers, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String imageUrl, boolean wishlist) {
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