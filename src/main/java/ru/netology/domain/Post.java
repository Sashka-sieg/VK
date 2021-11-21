package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int createdBy;
    private TextImage textImage;
    private Copyright copyright;
    private LikeInfo like;
    private RepostInfo repost;
    private Views views;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;
}
