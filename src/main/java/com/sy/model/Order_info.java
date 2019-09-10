package com.sy.model;

import java.math.BigDecimal;
import java.util.Date;

public class Order_info {
    private String orderId;

    private Date orderTime;

    private String orderSn;

    private String pickUserId;

    private BigDecimal repeatPv;

    private BigDecimal basePv;

    private BigDecimal serviceFee;

    private BigDecimal shipFre;

    private BigDecimal tax;

    private String country;

    private String tel;

    private String mobile;

    private String email;

    private String userAddress;

    private String postcode;

    private Integer stat;

    private String shipType;

    private String shipNum;

    private Date shipTime;

    private Date receiveTime;

    private String shipNote;

    private String buyUserId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getPickUserId() {
        return pickUserId;
    }

    public void setPickUserId(String pickUserId) {
        this.pickUserId = pickUserId;
    }

    public BigDecimal getRepeatPv() {
        return repeatPv;
    }

    public void setRepeatPv(BigDecimal repeatPv) {
        this.repeatPv = repeatPv;
    }

    public BigDecimal getBasePv() {
        return basePv;
    }

    public void setBasePv(BigDecimal basePv) {
        this.basePv = basePv;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public BigDecimal getShipFre() {
        return shipFre;
    }

    public void setShipFre(BigDecimal shipFre) {
        this.shipFre = shipFre;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipNum() {
        return shipNum;
    }

    public void setShipNum(String shipNum) {
        this.shipNum = shipNum;
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getShipNote() {
        return shipNote;
    }

    public void setShipNote(String shipNote) {
        this.shipNote = shipNote;
    }

    public String getBuyUserId() {
        return buyUserId;
    }

    public void setBuyUserId(String buyUserId) {
        this.buyUserId = buyUserId;
    }
}