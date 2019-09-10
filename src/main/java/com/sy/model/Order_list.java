package com.sy.model;

import java.math.BigDecimal;

public class Order_list {
    private String listId;

    private String goodsSn;

    private String goodsName;

    private String goodsFormat;

    private Integer goodsNum;

    private BigDecimal eachPrice;

    private BigDecimal sumPrice;

    private BigDecimal discount;

    private BigDecimal realPrice;

    private String currency;

    private BigDecimal realPv;

    private BigDecimal pvRate;

    private String orderId;

    private String goodsId;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsFormat() {
        return goodsFormat;
    }

    public void setGoodsFormat(String goodsFormat) {
        this.goodsFormat = goodsFormat;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getEachPrice() {
        return eachPrice;
    }

    public void setEachPrice(BigDecimal eachPrice) {
        this.eachPrice = eachPrice;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getRealPv() {
        return realPv;
    }

    public void setRealPv(BigDecimal realPv) {
        this.realPv = realPv;
    }

    public BigDecimal getPvRate() {
        return pvRate;
    }

    public void setPvRate(BigDecimal pvRate) {
        this.pvRate = pvRate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}