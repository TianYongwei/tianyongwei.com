package com.tianyongwei.entity.core;

public class Navigation {
    private Long userId;

    private String title;

    private String url;

    private Boolean isTop;

    private Long viewCount;

    //是否具有RSS功能
    private Boolean isRss;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean top) {
        isTop = top;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Boolean getRss() {
        return isRss;
    }

    public void setRss(Boolean rss) {
        isRss = rss;
    }
}
