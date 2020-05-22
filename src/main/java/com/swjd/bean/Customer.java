package com.swjd.bean;

public class Customer {

    private int customerId;
    private String customerName;
    private int getCustomerUserId;
    //客户负责人的真实姓名
    private  String customerUserName;
    private int customerCreateId;
    private String customerSourse;
    //客户信息来源
    private String customerSourseDict;
    private String customerIndustry;
    //客户行业
    private String CustomerIndustryDict;
    private String customerPhone;
    private String customerAddress;
    private String customerDate;

    public Customer() {
    }

    public Customer(int customerId, String customerName, int getCustomerUserId, String customerUserName, int customerCreateId, String customerSourse, String customerSourseDict, String customerIndustry, String customerIndustryDict, String customerPhone, String customerAddress, String customerDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.getCustomerUserId = getCustomerUserId;
        this.customerUserName = customerUserName;
        this.customerCreateId = customerCreateId;
        this.customerSourse = customerSourse;
        this.customerSourseDict = customerSourseDict;
        this.customerIndustry = customerIndustry;
        CustomerIndustryDict = customerIndustryDict;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.customerDate = customerDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", getCustomerUserId=" + getCustomerUserId +
                ", customerUserName='" + customerUserName + '\'' +
                ", customerCreateId=" + customerCreateId +
                ", customerSourse='" + customerSourse + '\'' +
                ", customerSourseDict='" + customerSourseDict + '\'' +
                ", customerIndustry='" + customerIndustry + '\'' +
                ", CustomerIndustryDict='" + CustomerIndustryDict + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerDate='" + customerDate + '\'' +
                '}';
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getGetCustomerUserId() {
        return getCustomerUserId;
    }

    public void setGetCustomerUserId(int getCustomerUserId) {
        this.getCustomerUserId = getCustomerUserId;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public int getCustomerCreateId() {
        return customerCreateId;
    }

    public void setCustomerCreateId(int customerCreateId) {
        this.customerCreateId = customerCreateId;
    }

    public String getCustomerSourse() {
        return customerSourse;
    }

    public void setCustomerSourse(String customerSourse) {
        this.customerSourse = customerSourse;
    }

    public String getCustomerSourseDict() {
        return customerSourseDict;
    }

    public void setCustomerSourseDict(String customerSourseDict) {
        this.customerSourseDict = customerSourseDict;
    }

    public String getCustomerIndustry() {
        return customerIndustry;
    }

    public void setCustomerIndustry(String customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

    public String getCustomerIndustryDict() {
        return CustomerIndustryDict;
    }

    public void setCustomerIndustryDict(String customerIndustryDict) {
        CustomerIndustryDict = customerIndustryDict;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerDate() {
        return customerDate;
    }

    public void setCustomerDate(String customerDate) {
        this.customerDate = customerDate;
    }
}
