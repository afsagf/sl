package com.sy.model;

import java.math.BigDecimal;
import java.util.Date;

public class User_account_log_201404 {
    private Long accountlogid;

    private Long userid;

    private Date actiontime;

    private String actiondesc;

    private Integer actiontype;

    private BigDecimal basein;

    private BigDecimal baseout;

    private BigDecimal basebalance;

    private BigDecimal repeatin;

    private BigDecimal repeatout;

    private BigDecimal repeatbalance;

    public Long getAccountlogid() {
        return accountlogid;
    }

    public void setAccountlogid(Long accountlogid) {
        this.accountlogid = accountlogid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getActiontime() {
        return actiontime;
    }

    public void setActiontime(Date actiontime) {
        this.actiontime = actiontime;
    }

    public String getActiondesc() {
        return actiondesc;
    }

    public void setActiondesc(String actiondesc) {
        this.actiondesc = actiondesc;
    }

    public Integer getActiontype() {
        return actiontype;
    }

    public void setActiontype(Integer actiontype) {
        this.actiontype = actiontype;
    }

    public BigDecimal getBasein() {
        return basein;
    }

    public void setBasein(BigDecimal basein) {
        this.basein = basein;
    }

    public BigDecimal getBaseout() {
        return baseout;
    }

    public void setBaseout(BigDecimal baseout) {
        this.baseout = baseout;
    }

    public BigDecimal getBasebalance() {
        return basebalance;
    }

    public void setBasebalance(BigDecimal basebalance) {
        this.basebalance = basebalance;
    }

    public BigDecimal getRepeatin() {
        return repeatin;
    }

    public void setRepeatin(BigDecimal repeatin) {
        this.repeatin = repeatin;
    }

    public BigDecimal getRepeatout() {
        return repeatout;
    }

    public void setRepeatout(BigDecimal repeatout) {
        this.repeatout = repeatout;
    }

    public BigDecimal getRepeatbalance() {
        return repeatbalance;
    }

    public void setRepeatbalance(BigDecimal repeatbalance) {
        this.repeatbalance = repeatbalance;
    }
}