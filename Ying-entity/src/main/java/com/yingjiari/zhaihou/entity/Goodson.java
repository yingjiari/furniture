package com.yingjiari.zhaihou.entity;

public class Goodson {
    private int goodsonId;
    private String goodsonName;
    private String goodsonImg;
    private double goodsonPrice;
    private int goodsId;
    private String goodsName;
    private int goodsonkc;
    public Goodson(){}
    public Goodson(int goodsonId, String goodsonName, String goodsonImg, double goodsonPrice, int goodsId, String goodsName,int goodsonkc) {
        this.goodsonId = goodsonId;
        this.goodsonName = goodsonName;
        this.goodsonImg = goodsonImg;
        this.goodsonPrice = goodsonPrice;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsonkc=goodsonkc;
    }

    @Override
    public String toString() {
        return "Goodson{" +
                "goodsonId=" + goodsonId +
                ", goodsonName='" + goodsonName + '\'' +
                ", goodsonImg='" + goodsonImg + '\'' +
                ", goodsonPrice=" + goodsonPrice +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsonkc=" + goodsonkc +
                '}';
    }

    public int getGoodsonId() {
        return goodsonId;
    }

    public void setGoodsonId(int goodsonId) {
        this.goodsonId = goodsonId;
    }

    public String getGoodsonName() {
        return goodsonName;
    }

    public void setGoodsonName(String goodsonName) {
        this.goodsonName = goodsonName;
    }

    public String getGoodsonImg() {
        return goodsonImg;
    }

    public void setGoodsonImg(String goodsonImg) {
        this.goodsonImg = goodsonImg;
    }

    public double getGoodsonPrice() {
        return goodsonPrice;
    }

    public void setGoodsPrice(double goodsonPrice) {
        this.goodsonPrice = goodsonPrice;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public int getGoodsonkc() {
        return goodsonkc;
    }

    public void setGoodsonkc(int goodsonkc) {
        this.goodsonkc = goodsonkc;
    }
}
