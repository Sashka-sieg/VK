package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
    private String imageUrl;
    private String textComment;

    public int getCount() {
        return count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
}
