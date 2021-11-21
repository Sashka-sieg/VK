package ru.netology.domain;

public class TextImage {
    private String textPost;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;

    public String getTextPost() {
        return textPost;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }
}
