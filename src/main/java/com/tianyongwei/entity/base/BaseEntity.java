package com.tianyongwei.entity.base;

import java.sql.Date;

public class BaseEntity {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Long createUser;

    private Long updateUser;

    //逻辑删除
    private Boolean isDrop;

    //上下架
    private Boolean isShangjia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public Boolean getDrop() {
        return isDrop;
    }

    public void setDrop(Boolean drop) {
        isDrop = drop;
    }

    public Boolean getShangjia() {
        return isShangjia;
    }

    public void setShangjia(Boolean shangjia) {
        isShangjia = shangjia;
    }
}
