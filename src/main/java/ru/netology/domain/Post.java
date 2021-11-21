package ru.netology.domain;

import java.util.Date;

public class Post {
    private String id;
    private String nameGroup;
    private Date dateAndTimePost;
    private String text;
    private String ImageUrl;
    private int likeInfo;
    private int repostInfo;
    private int viewInfo;
    private CommentsInfo commentsInfo;

    public String getNameGroup() {
        return nameGroup;
    }

    public Date getDateAndTimePost() {
        return dateAndTimePost;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public int getLikeInfo() {
        return likeInfo;
    }

    public int getRepostInfo() {
        return repostInfo;
    }

    public int getViewInfo() {
        return viewInfo;

    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setLikeInfo(int likeInfo) {
        this.likeInfo = likeInfo;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public void setDateAndTimePost(Date dateAndTimePost) {
        this.dateAndTimePost = dateAndTimePost;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setRepostInfo(int repostInfo) {
        this.repostInfo = repostInfo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setViewInfo(int viewInfo) {
        this.viewInfo = viewInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}

