package com.yingjiari.zhaihou.entity;

public class Goods {
    private int goodsID;
    private String goodsName;
    private String goodsUnitPrice;
    private int sellCount;
    private  String goodsImg;

    public Goods(){}

    public Goods(String goodsName, String goodsUnitPrice,int sellCount, String goodsImg) {
        this.goodsName = goodsName;
        this.goodsUnitPrice = goodsUnitPrice;
        this.sellCount=sellCount;
        this.goodsImg=goodsImg;
    }

    public Goods(int goodsID, String goodsName, String goodsUnitPrice,int sellCount, String goodsImg) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.goodsUnitPrice = goodsUnitPrice;
        this.sellCount=sellCount;
        this.goodsImg=goodsImg;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsID=" + goodsID +
                ", goodsName='" + goodsName + '\'' +
                ", goodsUnitPrice=" + goodsUnitPrice +
                ", sellCount=" + sellCount +
                ", goodsImg='" + goodsImg + '\'' +
                '}';
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    public void setGoodsUnitPrice(String goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public int getSellCount() {
        return sellCount;
    }

    public void setSellCount(int sellCount) {
        this.sellCount = sellCount;
    }
}
