package com.xienan.model;
import java.util.Date;

public class Rating {
    private Long athletesId;

    private Integer boxing;

    private Integer kickLeg;

    private Integer speed;

    private Integer defense;

    private Integer power;

    private Date insertTime;

    public Long getAthletesId() {
        return athletesId;
    }

    public void setAthletesId(Long athletesId) {
        this.athletesId = athletesId;
    }

    public Integer getBoxing() {
        return boxing;
    }

    public void setBoxing(Integer boxing) {
        this.boxing = boxing;
    }

    public Integer getKickLeg() {
        return kickLeg;
    }

    public void setKickLeg(Integer kickLeg) {
        this.kickLeg = kickLeg;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}