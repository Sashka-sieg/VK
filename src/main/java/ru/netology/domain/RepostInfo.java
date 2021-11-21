package ru.netology.domain;

public class RepostInfo {
    private int count;
    private String icon;
    private boolean userRepost;

    public int getCount() {
        return count;
    }

    public boolean isUserRepost() {
        return userRepost;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }
}
