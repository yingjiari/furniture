package com.yingjiari.zhaihou.entity;

import java.sql.Date;

public class Entry {

    private int zid;
    private String zname;
    private String zpwd;
    private Date zdate;

    public Entry(){}

    public Entry( String zname, String zpwd) {
        this.zname = zname;
        this.zpwd = zpwd;
    }

    public Entry(int zid, String zname, String zpwd,Date zdate) {
        this.zid = zid;
        this.zname = zname;
        this.zpwd = zpwd;
        this.zdate=zdate;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "zid=" + zid +
                ", zname='" + zname + '\'' +
                ", zpwd='" + zpwd + '\'' +
                ", zdate=" + zdate +
                '}';
    }

    public int getZid() {
        return zid;
    }

    public void setZid(int zid) {
        this.zid = zid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getZpwd() {
        return zpwd;
    }

    public void setZpwd(String zpwd) {
        this.zpwd = zpwd;
    }

    public Date getZdate() {
        return zdate;
    }

    public void setZdate(Date zdate) {
        this.zdate = zdate;
    }
}
