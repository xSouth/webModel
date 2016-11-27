package com.xienan.model;

import java.util.Date;

public class Realm {
    private Integer realmId;

    private String realmContent;

    private Date insertTime;

    public Integer getRealmId() {
        return realmId;
    }

    public void setRealmId(Integer realmId) {
        this.realmId = realmId;
    }

    public String getRealmContent() {
        return realmContent;
    }

    public void setRealmContent(String realmContent) {
        this.realmContent = realmContent == null ? null : realmContent.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}