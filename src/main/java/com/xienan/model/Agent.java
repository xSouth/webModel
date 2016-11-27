package com.xienan.model;

import java.util.Date;

public class Agent {
    private Long agentId;

    private String agentName;

    private Byte agentSex;

    private String companyName;

    private String companyAddress;

    private Integer agentAge;

    private String agentPostcode;

    private String agentPhone;

    private String agentMailbox;

    private Date signTimeFrom;

    private Date signTimeEnd;

    private Date insertTime;

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public Byte getAgentSex() {
        return agentSex;
    }

    public void setAgentSex(Byte agentSex) {
        this.agentSex = agentSex;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Integer getAgentAge() {
        return agentAge;
    }

    public void setAgentAge(Integer agentAge) {
        this.agentAge = agentAge;
    }

    public String getAgentPostcode() {
        return agentPostcode;
    }

    public void setAgentPostcode(String agentPostcode) {
        this.agentPostcode = agentPostcode == null ? null : agentPostcode.trim();
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone == null ? null : agentPhone.trim();
    }

    public String getAgentMailbox() {
        return agentMailbox;
    }

    public void setAgentMailbox(String agentMailbox) {
        this.agentMailbox = agentMailbox == null ? null : agentMailbox.trim();
    }

    public Date getSignTimeFrom() {
        return signTimeFrom;
    }

    public void setSignTimeFrom(Date signTimeFrom) {
        this.signTimeFrom = signTimeFrom;
    }

    public Date getSignTimeEnd() {
        return signTimeEnd;
    }

    public void setSignTimeEnd(Date signTimeEnd) {
        this.signTimeEnd = signTimeEnd;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}