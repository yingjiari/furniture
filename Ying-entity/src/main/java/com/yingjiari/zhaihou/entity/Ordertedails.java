package com.yingjiari.zhaihou.entity;

public class Ordertedails {
    public int orderId;
    public int goodsonId;
    public int goodsonNumber;
    public String goodsonName;
    public String goodsonImg;
    public double goodsonPrice;
    public String customerName;
    public String orderPrice;
    public int orderBoolean;

    public Ordertedails(){}

    public Ordertedails(int orderId,int goodsonId,int goodsonNumber){
        this.orderId=orderId;
        this.goodsonId=goodsonId;
        this.goodsonNumber=goodsonNumber;
    }

    public Ordertedails(int orderId, int goodsonNumber, String goodsonName, String goodsonImg, double goodsonPrice, String customerName, String orderPrice, int orderBoolean) {
        this.orderId = orderId;
        this.goodsonNumber = goodsonNumber;
        this.goodsonName = goodsonName;
        this.goodsonImg = goodsonImg;
        this.goodsonPrice = goodsonPrice;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        this.orderBoolean = orderBoolean;
    }

    @Override
    public String toString() {
        return "Ordertedails{" +
                "orderId=" + orderId +
                ", goodsonId=" + goodsonId +
                ", goodsonNumber=" + goodsonNumber +
                ", goodsonName='" + goodsonName + '\'' +
                ", goodsonImg='" + goodsonImg + '\'' +
                ", goodsonPrice=" + goodsonPrice +
                ", customerName='" + customerName + '\'' +
                ", orderPrice='" + orderPrice + '\'' +
                ", orderBoolean=" + orderBoolean +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getGoodsonId() {
        return goodsonId;
    }

    public void setGoodsonId(int goodsonId) {
        this.goodsonId = goodsonId;
    }

    public int getGoodsonNumber() {
        return goodsonNumber;
    }

    public void setGoodsonNumber(int goodsonNumber) {
        this.goodsonNumber = goodsonNumber;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderBoolean() {
        return orderBoolean;
    }

    public void setOrderBoolean(int orderBoolean) {
        this.orderBoolean = orderBoolean;
    }
}
