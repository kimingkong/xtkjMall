package com.example.demo.entity;

/**
 * @program: XTmall
 * @Date: 2019/7/4 16:49
 * @Author: Fox
 * @Description:
 */
public class Appraise {
    private int aid;
    private User uid;
    private Goods gid;
    private String title;
    private String content;
    private String apptime;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public Goods getGid() {
        return gid;
    }

    public void setGid(Goods gid) {
        this.gid = gid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getApptime() {
        return apptime;
    }

    public void setApptime(String apptime) {
        this.apptime = apptime;
    }
}
