package com.xienan.model;

import java.util.Date;

public class Baby {
    private Long babyId;

    private String babyName;

    private Date babyBirthday;

    private Integer babyHeight;

    private Integer babyWeight;

    private Integer babyBust;

    private Integer babyHip;

    private Integer babyWaist;

    private String babyPhone;

    private String babyAddress;

    private String babyUpperbodycare;

    private String babyFullbodycare;

    private Date insertTime;

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName == null ? null : babyName.trim();
    }

    public Date getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(Date babyBirthday) {
        this.babyBirthday = babyBirthday;
    }

    public Integer getBabyHeight() {
        return babyHeight;
    }

    public void setBabyHeight(Integer babyHeight) {
        this.babyHeight = babyHeight;
    }

    public Integer getBabyWeight() {
        return babyWeight;
    }

    public void setBabyWeight(Integer babyWeight) {
        this.babyWeight = babyWeight;
    }

    public Integer getBabyBust() {
        return babyBust;
    }

    public void setBabyBust(Integer babyBust) {
        this.babyBust = babyBust;
    }

    public Integer getBabyHip() {
        return babyHip;
    }

    public void setBabyHip(Integer babyHip) {
        this.babyHip = babyHip;
    }

    public Integer getBabyWaist() {
        return babyWaist;
    }

    public void setBabyWaist(Integer babyWaist) {
        this.babyWaist = babyWaist;
    }

    public String getBabyPhone() {
        return babyPhone;
    }

    public void setBabyPhone(String babyPhone) {
        this.babyPhone = babyPhone == null ? null : babyPhone.trim();
    }

    public String getBabyAddress() {
        return babyAddress;
    }

    public void setBabyAddress(String babyAddress) {
        this.babyAddress = babyAddress == null ? null : babyAddress.trim();
    }

    public String getBabyUpperbodycare() {
        return babyUpperbodycare;
    }

    public void setBabyUpperbodycare(String babyUpperbodycare) {
        this.babyUpperbodycare = babyUpperbodycare == null ? null : babyUpperbodycare.trim();
    }

    public String getBabyFullbodycare() {
        return babyFullbodycare;
    }

    public void setBabyFullbodycare(String babyFullbodycare) {
        this.babyFullbodycare = babyFullbodycare == null ? null : babyFullbodycare.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}