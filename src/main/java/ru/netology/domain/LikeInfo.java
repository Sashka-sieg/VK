package ru.netology.domain;

public class LikeInfo {
    private int count;
    private boolean canLike;
    private boolean canUserLike;
    private boolean removeLike;
    private boolean canPublish;
    private String icon;

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public int getCount() {
        return count;
    }

    public boolean isRemoveLike() {
        return removeLike;
    }

    public boolean isCanUserLike() {
        return canUserLike;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setRemoveLike(boolean removeLike) {
        this.removeLike = removeLike;
    }

    public void setCanUserLike(boolean canUserLike) {
        this.canUserLike = canUserLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
