package com.xienan.model;
import java.util.Date;

public class Contestant {
    private Long contestantId;

    private String contestantName;

    private Byte contestantSex;

    private Date contestantBirthday;

    private String contestantBirthfrom;

    private String contestantCountry;

    private String contestantNationality;

    private Integer contestantWeight;

    private Integer contestantHeight;

    private String contestantPassportName;

    private String contestantPassportNumber;

    private Date contestantPbSince;

    private Date contestantPbEnd;

    private String contestantPassportAddress;

    private String contestantPhone;

    private String contestantAddress;

    private String contestantMailbox;

    private String contestantPostcode;

    private String contestantPapersPhoto;

    private String contestantBodicePhoto;

    private String contestantBodyPhoto;

    private Long agentId;

    private String selfassessment;

    private String trainingScreen;

    private Date insertTime;

    public Long getContestantId() {
        return contestantId;
    }

    public void setContestantId(Long contestantId) {
        this.contestantId = contestantId;
    }

    public String getContestantName() {
        return contestantName;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName == null ? null : contestantName.trim();
    }

    public Byte getContestantSex() {
        return contestantSex;
    }

    public void setContestantSex(Byte contestantSex) {
        this.contestantSex = contestantSex;
    }

    public Date getContestantBirthday() {
        return contestantBirthday;
    }

    public void setContestantBirthday(Date contestantBirthday) {
        this.contestantBirthday = contestantBirthday;
    }

    public String getContestantBirthfrom() {
        return contestantBirthfrom;
    }

    public void setContestantBirthfrom(String contestantBirthfrom) {
        this.contestantBirthfrom = contestantBirthfrom == null ? null : contestantBirthfrom.trim();
    }

    public String getContestantCountry() {
        return contestantCountry;
    }

    public void setContestantCountry(String contestantCountry) {
        this.contestantCountry = contestantCountry == null ? null : contestantCountry.trim();
    }

    public String getContestantNationality() {
        return contestantNationality;
    }

    public void setContestantNationality(String contestantNationality) {
        this.contestantNationality = contestantNationality == null ? null : contestantNationality.trim();
    }

    public Integer getContestantWeight() {
        return contestantWeight;
    }

    public void setContestantWeight(Integer contestantWeight) {
        this.contestantWeight = contestantWeight;
    }

    public Integer getContestantHeight() {
        return contestantHeight;
    }

    public void setContestantHeight(Integer contestantHeight) {
        this.contestantHeight = contestantHeight;
    }

    public String getContestantPassportName() {
        return contestantPassportName;
    }

    public void setContestantPassportName(String contestantPassportName) {
        this.contestantPassportName = contestantPassportName == null ? null : contestantPassportName.trim();
    }

    public String getContestantPassportNumber() {
        return contestantPassportNumber;
    }

    public void setContestantPassportNumber(String contestantPassportNumber) {
        this.contestantPassportNumber = contestantPassportNumber == null ? null : contestantPassportNumber.trim();
    }

    public Date getContestantPbSince() {
        return contestantPbSince;
    }

    public void setContestantPbSince(Date contestantPbSince) {
        this.contestantPbSince = contestantPbSince;
    }

    public Date getContestantPbEnd() {
        return contestantPbEnd;
    }

    public void setContestantPbEnd(Date contestantPbEnd) {
        this.contestantPbEnd = contestantPbEnd;
    }

    public String getContestantPassportAddress() {
        return contestantPassportAddress;
    }

    public void setContestantPassportAddress(String contestantPassportAddress) {
        this.contestantPassportAddress = contestantPassportAddress == null ? null : contestantPassportAddress.trim();
    }

    public String getContestantPhone() {
        return contestantPhone;
    }

    public void setContestantPhone(String contestantPhone) {
        this.contestantPhone = contestantPhone == null ? null : contestantPhone.trim();
    }

    public String getContestantAddress() {
        return contestantAddress;
    }

    public void setContestantAddress(String contestantAddress) {
        this.contestantAddress = contestantAddress == null ? null : contestantAddress.trim();
    }

    public String getContestantMailbox() {
        return contestantMailbox;
    }

    public void setContestantMailbox(String contestantMailbox) {
        this.contestantMailbox = contestantMailbox == null ? null : contestantMailbox.trim();
    }

    public String getContestantPostcode() {
        return contestantPostcode;
    }

    public void setContestantPostcode(String contestantPostcode) {
        this.contestantPostcode = contestantPostcode == null ? null : contestantPostcode.trim();
    }

    public String getContestantPapersPhoto() {
        return contestantPapersPhoto;
    }

    public void setContestantPapersPhoto(String contestantPapersPhoto) {
        this.contestantPapersPhoto = contestantPapersPhoto == null ? null : contestantPapersPhoto.trim();
    }

    public String getContestantBodicePhoto() {
        return contestantBodicePhoto;
    }

    public void setContestantBodicePhoto(String contestantBodicePhoto) {
        this.contestantBodicePhoto = contestantBodicePhoto == null ? null : contestantBodicePhoto.trim();
    }

    public String getContestantBodyPhoto() {
        return contestantBodyPhoto;
    }

    public void setContestantBodyPhoto(String contestantBodyPhoto) {
        this.contestantBodyPhoto = contestantBodyPhoto == null ? null : contestantBodyPhoto.trim();
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getSelfassessment() {
        return selfassessment;
    }

    public void setSelfassessment(String selfassessment) {
        this.selfassessment = selfassessment == null ? null : selfassessment.trim();
    }

    public String getTrainingScreen() {
        return trainingScreen;
    }

    public void setTrainingScreen(String trainingScreen) {
        this.trainingScreen = trainingScreen == null ? null : trainingScreen.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}