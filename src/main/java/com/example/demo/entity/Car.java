package com.example.demo.entity;

/**
 * @program: XTmall
 * @Date: 2019/7/4 16:27
 * @Author: Fox
 * @Description:
 */
public class Car {
    private int cid;
    private Goods gid;
    private String addtime;
    private User uid;
    private int num;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Goods getGid() {
        return gid;
    }

    public void setGid(Goods gid) {
        this.gid = gid;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
