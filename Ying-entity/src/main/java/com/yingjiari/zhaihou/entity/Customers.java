package com.yingjiari.zhaihou.entity;

public class Customers {
    private String Customer;
    private int siteCellphone;
    private String siteSave;
    private String siteCity;
    private String siteDistrict;
    private String siteTown;
    private String siteDetails;
    private int siteMail;
    private String siteTag;
    private String goodsonName;
    private String goodsonImg;
    private double goodsonPrice;
    private int shoppingBoolean;
    private int shoppingNumber;
    private String goodsName;
    public Customers(){}
    public Customers(String customer, int siteCellphone, String siteSave, String siteCity, String siteDistrict, String siteTown, String siteDetails, int siteMail, String siteTag, String goodsonName, String goodsonImg, double goodsonPrice, int shoppingBoolean, int shoppingNumber, String goodsName) {
        Customer = customer;
        this.siteCellphone = siteCellphone;
        this.siteSave = siteSave;
        this.siteCity = siteCity;
        this.siteDistrict = siteDistrict;
        this.siteTown = siteTown;
        this.siteDetails = siteDetails;
        this.siteMail = siteMail;
        this.siteTag = siteTag;
        this.goodsonName = goodsonName;
        this.goodsonImg = goodsonImg;
        this.goodsonPrice = goodsonPrice;
        this.shoppingBoolean = shoppingBoolean;
        this.shoppingNumber = shoppingNumber;
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "Customer='" + Customer + '\'' +
                ", siteCellphone=" + siteCellphone +
                ", siteSave='" + siteSave + '\'' +
                ", siteCity='" + siteCity + '\'' +
                ", siteDistrict='" + siteDistrict + '\'' +
                ", siteTown='" + siteTown + '\'' +
                ", siteDetails='" + siteDetails + '\'' +
                ", siteMail=" + siteMail +
                ", siteTag='" + siteTag + '\'' +
                ", goodsonName='" + goodsonName + '\'' +
                ", goodsonImg='" + goodsonImg + '\'' +
                ", goodsonPrice=" + goodsonPrice +
                ", shoppingBoolean=" + shoppingBoolean +
                ", shoppingNumber=" + shoppingNumber +
                ", goodsName='" + goodsName + '\'' +
                '}';
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
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

    public int getShoppingBoolean() {
        return shoppingBoolean;
    }

    public void setShoppingBoolean(int shoppingBoolean) {
        this.shoppingBoolean = shoppingBoolean;
    }

    public int getShoppingNumber() {
        return shoppingNumber;
    }

    public void setShoppingNumber(int shoppingNumber) {
        this.shoppingNumber = shoppingNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
