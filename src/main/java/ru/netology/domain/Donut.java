package ru.netology.domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private boolean canPublishFreeCopy;
    private String editMode;
    private Placeholder placeholder;

    public boolean isDonut() {
        return isDonut;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public String getEditMode() {
        return editMode;
    }


    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }
}

