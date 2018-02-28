package com.tianyongwei.entity.social;

public class FollowUser {
    private Long userId;

    //被关注的用户
    private Long followUserId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Long followUserId) {
        this.followUserId = followUserId;
    }
}
