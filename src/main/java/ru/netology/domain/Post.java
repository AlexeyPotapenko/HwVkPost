package ru.netology.domain;

public class Post {

    private int id;

    private int ownerId;

    private int fromId;

    private int createdBy;

    private int date;

    private String text;

    private int replyOwnerId;

    private int replyPostId;

    private boolean friendsOnly;

    private CommentsInfo commentsInfo;

    private Copyright copyright;

    private Like like;

    private Repost repost;

    private Views views;

    private String postType;

    private PostSource postSource;

    private Geo geo;

    private int signerId;

    private boolean canPin;

    private boolean canDelete;

    private boolean isPinned;

    private boolean markedAsAds;

    private boolean isFavorite;

    private Donut donut;

    private int postponedId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean getFriendsOnly() {
        return friendsOnly;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public Views getViews() {
        return views;
    }

    public void setViews(Views views) {
        this.views = views;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean getCanPin() {
        return canPin;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean getCanDelete() {
        return canDelete;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean getPinned() {
        return isPinned;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean getMarkedAsAds() {
        return markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean getFavorite() {
        return isFavorite;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getPostponedId() {
        return postponedId;
    }
}
