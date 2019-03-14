package com.yingjiari.zhaihou.entity;

public class Site {
    private String customerName;
    private int siteCellphone;
    private String siteSave;
    private String siteCity;
    private String siteDistrict;
    private String siteTown;
    private String siteDetails;
    private int siteMail;
    private String siteTag;
    private int siteBoolean;
    private int siteId;
    public Site(){}
    public Site(int siteId,int siteBoolean){
        this.siteId=siteId;
        this.siteBoolean=siteBoolean;
    }

    public Site(String customerName, int siteCellphone, String siteDetails, int siteMail, String siteTag, int siteBoolean) {
        this.customerName = customerName;
        this.siteCellphone = siteCellphone;
        this.siteDetails = siteDetails;
        this.siteMail = siteMail;
        this.siteTag = siteTag;
        this.siteBoolean = siteBoolean;
    }

    public Site(String customerName, int siteCellphone, String siteSave, String siteCity, String siteDistrict, String siteTown, String siteDetails, int siteMail, String siteTag, int siteBoolean, int siteId) {
        this.customerName = customerName;
        this.siteCellphone = siteCellphone;
        this.siteSave = siteSave;
        this.siteCity = siteCity;
        this.siteDistrict = siteDistrict;
        this.siteTown = siteTown;
        this.siteDetails = siteDetails;
        this.siteMail = siteMail;
        this.siteTag = siteTag;
        this.siteBoolean = siteBoolean;
        this.siteId = siteId;
    }

    @Override
    public String toString() {
        return "Site{" +
                "customerName='" + customerName + '\'' +
                ", siteCellphone=" + siteCellphone +
                ", siteSave='" + siteSave + '\'' +
                ", siteCity='" + siteCity + '\'' +
                ", siteDistrict='" + siteDistrict + '\'' +
                ", siteTown='" + siteTown + '\'' +
                ", siteDetails='" + siteDetails + '\'' +
                ", siteMail=" + siteMail +
                ", siteTag='" + siteTag + '\'' +
                ", siteBoolean=" + siteBoolean +
                ", siteId=" + siteId +
                '}';
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public int getSiteBoolean() {
        return siteBoolean;
    }

    public void setSiteBoolean(int siteBoolean) {
        this.siteBoolean = siteBoolean;
    }
}
