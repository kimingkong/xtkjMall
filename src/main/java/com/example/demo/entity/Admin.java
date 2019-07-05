package com.example.demo.entity;

/**
 * @program: XTmall
 * @Date: 2019/7/4 16:26
 * @Author: Fox
 * @Description:
 */
public class Admin {
    private int aid;
    private String account;
    private String aname;
    private String password;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
