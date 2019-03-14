package com.yingjiari.zhaihou.entity;

public class Shopping {
    private String goodsName;
    private String goodsonName;
    private String goodsonImg;
    private double goodsonPrice;
    private int shoppingNumber;
    private int goodsId;
    private int goodsonId;
    private int shoppingId;
    private String customerName;
    private int shoppingBoolean;
    public Shopping(){}
    public Shopping(int shoppingBoolean,String customerName){
        this.shoppingBoolean=shoppingBoolean;
        this.customerName=customerName;
    }
    public Shopping(int shoppingId, int shoppingBoolean,int shoppingNumber) {
        this.shoppingId = shoppingId;
        this.shoppingBoolean = shoppingBoolean;
        this.shoppingNumber=shoppingNumber;
    }
    public Shopping(int shoppingNumber, int goodsId, String customerName) {
        this.shoppingNumber = shoppingNumber;
        this.goodsId = goodsId;
        this.customerName = customerName;
    }

    public Shopping(int goodsonId,String goodsName, String goodsonName, String goodsonImg, double goodsonPrice, int shoppingNumber, String customerName) {
        this.goodsonId=goodsonId;
        this.goodsonName = goodsonName;
        this.goodsonImg = goodsonImg;
        this.goodsonPrice = goodsonPrice;
        this.shoppingNumber = shoppingNumber;
        this.customerName=customerName;
        this.goodsName=goodsName;
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsonName='" + goodsonName + '\'' +
                ", goodsonImg='" + goodsonImg + '\'' +
                ", goodsonPrice=" + goodsonPrice +
                ", shoppingNumber=" + shoppingNumber +
                ", goodsId=" + goodsId +
                ", goodsonId=" + goodsonId +
                ", shoppingId=" + shoppingId +
                ", customerName='" + customerName + '\'' +
                ", shoppingBoolean=" + shoppingBoolean +
                '}';
    }

    public int getGoodsonId() {
        return goodsonId;
    }

    public void setGoodsonId(int goodsonId) {
        this.goodsonId = goodsonId;
    }

    public int getShoppingBoolean() {
        return shoppingBoolean;
    }

    public void setShoppingBoolean(int shoppingBoolean) {
        this.shoppingBoolean = shoppingBoolean;
    }

    public int getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(int shoppingId) {
        this.shoppingId = shoppingId;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public void setGoodsonPrice(double goodsonPrice) {
        this.goodsonPrice = goodsonPrice;
    }

    public int getShoppingNumber() {
        return shoppingNumber;
    }

    public void setShoppingNumber(int shoppingNumber) {
        this.shoppingNumber = shoppingNumber;
    }
}
