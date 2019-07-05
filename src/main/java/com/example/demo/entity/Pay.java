package com.example.demo.entity;

/**
 * @program: XTmall
 * @Date: 2019/7/4 16:48
 * @Author: Fox
 * @Description:
 */
public class Pay {
    private int pid;
    private Order oid;
    private User uid;
    private float money;
    private String paytime;
    private String paystatus;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Order getOid() {
        return oid;
    }

    public void setOid(Order oid) {
        this.oid = oid;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }
}
