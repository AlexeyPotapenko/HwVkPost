package ru.netology.domain;

public class Like {

    private int count;
    private boolean userLike;
    private boolean canLike;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public boolean getCanPublish() {
        return canPublish;
    }

    public boolean getUserLike() {
        return userLike;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }
}
