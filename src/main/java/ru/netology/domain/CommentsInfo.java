package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean canClose;
    private boolean canOpen;
    private String commentDate;
    private int commentId;
    private int likeInfo;
    private String imageUrl;
    private String textCommenr;

    public int getLikeInfo() {
        return likeInfo;
    }

    public int getCount() {
        return count;
    }

    public int getCommentId() {
        return commentId;
    }

    public boolean isCanClose() {
        return canClose;

    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTextCommenr() {
        return textCommenr;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLikeInfo(int likeInfo) {
        this.likeInfo = likeInfo;
    }

    public void setTextCommenr(String textCommenr) {
        this.textCommenr = textCommenr;
    }
}
