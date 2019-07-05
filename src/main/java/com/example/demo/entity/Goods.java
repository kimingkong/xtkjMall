package com.example.demo.entity;

/**
 * @program: XTmall
 * @Date: 2019/7/4 16:44
 * @Author: Fox
 * @Description:
 */
public class Goods {
    private String gid;
    private String gname;
    private float price;
    private Type tid;
    private int stock;
    private String indate;
    private String gstatus;
    private String image;
    private String description;
    private Admin aid;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Type getTid() {
        return tid;
    }

    public void setTid(Type tid) {
        this.tid = tid;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getGstatus() {
        return gstatus;
    }

    public void setGstatus(String gstatus) {
        this.gstatus = gstatus;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Admin getAid() {
        return aid;
    }

    public void setAid(Admin aid) {
        this.aid = aid;
    }
}
