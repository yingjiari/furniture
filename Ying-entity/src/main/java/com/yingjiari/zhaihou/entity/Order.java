package com.yingjiari.zhaihou.entity;

public class Order {
    private int orderId;
    private String customerName;
    private int orderBoolean;
    private String orderGoods;
    private double orderPrice;
    private int siteCellphone;
    private String siteSave;
    private String siteCity;
    private String siteDistrict;
    private String siteTown;
    private String siteDetails;
    private int siteMail;
    private String siteTag;

    public Order(){}
    public Order(int orderId){this.orderId=orderId;}
    public Order(int orderId,int orderBoolean){this.orderId=orderId;this.orderBoolean=orderBoolean;}
    public Order(int orderId, String customerName, int orderBoolean, String orderGoods, double orderPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderBoolean = orderBoolean;
        this.orderGoods = orderGoods;
        this.orderPrice = orderPrice;
    }

    public Order(int orderId, String customerName, int orderBoolean, String orderGoods, double orderPrice, int siteCellphone, String siteSave, String siteCity, String siteDistrict, String siteTown, String siteDetails, int siteMail, String siteTag) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderBoolean = orderBoolean;
        this.orderGoods = orderGoods;
        this.orderPrice = orderPrice;
        this.siteCellphone = siteCellphone;
        this.siteSave = siteSave;
        this.siteCity = siteCity;
        this.siteDistrict = siteDistrict;
        this.siteTown = siteTown;
        this.siteDetails = siteDetails;
        this.siteMail = siteMail;
        this.siteTag = siteTag;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", orderBoolean=" + orderBoolean +
                ", orderGoods='" + orderGoods + '\'' +
                ", orderPrice=" + orderPrice +
                ", siteCellphone=" + siteCellphone +
                ", siteSave='" + siteSave + '\'' +
                ", siteCity='" + siteCity + '\'' +
                ", siteDistrict='" + siteDistrict + '\'' +
                ", siteTown='" + siteTown + '\'' +
                ", siteDetails='" + siteDetails + '\'' +
                ", siteMail=" + siteMail +
                ", siteTag='" + siteTag + '\'' +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrderBoolean() {
        return orderBoolean;
    }

    public void setOrderBoolean(int orderBoolean) {
        this.orderBoolean = orderBoolean;
    }

    public String getOrderGoods() {
        return orderGoods;
    }

    public void setOrderGoods(String orderGoods) {
        this.orderGoods = orderGoods;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getSiteCellphone() {
        return siteCellphone;
    }

    public void setSiteCellphone(int siteCellphone) {
        this.siteCellphone = siteCellphone;
    }

    public String getSiteSave() {
        return siteSave;
    }

    public void setSiteSave(String siteSave) {
        this.siteSave = siteSave;
    }

    public String getSiteCity() {
        return siteCity;
    }

    public void setSiteCity(String siteCity) {
        this.siteCity = siteCity;
    }

    public String getSiteDistrict() {
        return siteDistrict;
    }

    public void setSiteDistrict(String siteDistrict) {
        this.siteDistrict = siteDistrict;
    }

    public String getSiteTown() {
        return siteTown;
    }

    public void setSiteTown(String siteTown) {
        this.siteTown = siteTown;
    }

    public String getSiteDetails() {
        return siteDetails;
    }

    public void setSiteDetails(String siteDetails) {
        this.siteDetails = siteDetails;
    }

    public int getSiteMail() {
        return siteMail;
    }

    public void setSiteMail(int siteMail) {
        this.siteMail = siteMail;
    }

    public String getSiteTag() {
        return siteTag;
    }

    public void setSiteTag(String siteTag) {
        this.siteTag = siteTag;
    }
}
