package ru.netology.domain;

public class Repost {

    private int count;
    private boolean userReposted;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
    public boolean getUserReposted(){
        return userReposted;
    }
}
