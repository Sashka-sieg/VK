package ru.netology.domain;

public class likeInfo {
    private int like;
    private boolean canLike;
    private boolean canUserLike;
    private boolean removeLike;

    public int getLike() {
        return like;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public boolean isCanUserLike() {
        return canUserLike;
    }

    public boolean isRemoveLike() {
        return removeLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setCanUserLike(boolean canUserLike) {
        this.canUserLike = canUserLike;
    }

    public void setRemoveLike(boolean removeLike) {
        this.removeLike = removeLike;
    }
}

