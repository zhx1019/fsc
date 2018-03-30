package com.fsc.domain.bo;

import java.math.BigDecimal;

public class Custom {
    private Integer cusId;

    private String cusShortname;

    private String cusName;

    private String cusType;

    private String cusContact;

    private String cusCreattime;

    private BigDecimal cusPrice;

    private String cusSign;

    private String cusService;

    private String cusCreatman;

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusShortname() {
        return cusShortname;
    }

    public void setCusShortname(String cusShortname) {
        this.cusShortname = cusShortname == null ? null : cusShortname.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType == null ? null : cusType.trim();
    }

    public String getCusContact() {
        return cusContact;
    }

    public void setCusContact(String cusContact) {
        this.cusContact = cusContact == null ? null : cusContact.trim();
    }

    public String getCusCreattime() {
        return cusCreattime;
    }

    public void setCusCreattime(String cusCreattime) {
        this.cusCreattime = cusCreattime == null ? null : cusCreattime.trim();
    }

    public BigDecimal getCusPrice() {
        return cusPrice;
    }

    public void setCusPrice(BigDecimal cusPrice) {
        this.cusPrice = cusPrice;
    }

    public String getCusSign() {
        return cusSign;
    }

    public void setCusSign(String cusSign) {
        this.cusSign = cusSign == null ? null : cusSign.trim();
    }

    public String getCusService() {
        return cusService;
    }

    public void setCusService(String cusService) {
        this.cusService = cusService == null ? null : cusService.trim();
    }

    public String getCusCreatman() {
        return cusCreatman;
    }

    public void setCusCreatman(String cusCreatman) {
        this.cusCreatman = cusCreatman == null ? null : cusCreatman.trim();
    }
}