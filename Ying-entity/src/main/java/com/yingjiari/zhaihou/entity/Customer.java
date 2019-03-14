package com.yingjiari.zhaihou.entity;

public class Customer {
    private String customerName;
    private String  customerPass;
    private String  customerTrueName;
    private String  customerPhone;
    private String  customerIdcard;

    public Customer(){}


    public Customer(String customerName, String customerPass, String customerTrueName, String customerPhone, String customerIdcard) {
        this.customerName = customerName;
        this.customerPass = customerPass;
        this.customerTrueName = customerTrueName;
        this.customerPhone = customerPhone;
        this.customerIdcard = customerIdcard;
    }

    public Customer(String customerName, String customerPass) {
        this.customerName = customerName;
        this.customerPass = customerPass;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerPass='" + customerPass + '\'' +
                ", customerTrueName='" + customerTrueName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerIdcard='" + customerIdcard + '\'' +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPass() {
        return customerPass;
    }

    public void setCustomerPass(String customerPass) {
        this.customerPass = customerPass;
    }

    public String getCustomerTrueName() {
        return customerTrueName;
    }

    public void setCustomerTrueName(String customerTrueName) {
        this.customerTrueName = customerTrueName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerIdcard() {
        return customerIdcard;
    }

    public void setCustomerIdcard(String customerIdcard) {
        this.customerIdcard = customerIdcard;
    }
}
