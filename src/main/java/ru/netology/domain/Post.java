package ru.netology.domain;

import java.util.Date;

public class Post {
    private String id;
    private String nameGroup;
    private Date datePost;
    private String text;
    private String ImageUrl;
    private int likeInfo;
    private int viewInfo;
    private CommentsInfo commentsInfo;

    public String getNameGroup() {
        return nameGroup;
    }

    public Date getDatePost() {
        return datePost;
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

    public int getViewInfo() {
        return viewInfo;

    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setLikeInfo(int likeInfo) {
        this.likeInfo = likeInfo;
    }

    public void setViewInfo(int viewInfo) {
        this.viewInfo = viewInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}

