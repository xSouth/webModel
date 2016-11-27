package com.xienan.model;

import java.util.Date;

public class Recentscore {
    private Integer matchId;

    private String matchName;

    private String contestantTitle;

    private Integer matchYear;

    private String practiceName;

    private Integer matchWeight;

    private Date matchDate;

    private String matchPlayer;

    private Integer matchResult;

    private Long contestantId;

    private String trainingVideo;

    private Integer matchTitle;

    private Integer deuce;

    private Integer victory;

    private Integer loss;

    private Integer ko;

    private Date insertTime;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    public String getContestantTitle() {
        return contestantTitle;
    }

    public void setContestantTitle(String contestantTitle) {
        this.contestantTitle = contestantTitle == null ? null : contestantTitle.trim();
    }

    public Integer getMatchYear() {
        return matchYear;
    }

    public void setMatchYear(Integer matchYear) {
        this.matchYear = matchYear;
    }

    public String getPracticeName() {
        return practiceName;
    }

    public void setPracticeName(String practiceName) {
        this.practiceName = practiceName == null ? null : practiceName.trim();
    }

    public Integer getMatchWeight() {
        return matchWeight;
    }

    public void setMatchWeight(Integer matchWeight) {
        this.matchWeight = matchWeight;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getMatchPlayer() {
        return matchPlayer;
    }

    public void setMatchPlayer(String matchPlayer) {
        this.matchPlayer = matchPlayer == null ? null : matchPlayer.trim();
    }

    public Integer getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(Integer matchResult) {
        this.matchResult = matchResult;
    }

    public Long getContestantId() {
        return contestantId;
    }

    public void setContestantId(Long contestantId) {
        this.contestantId = contestantId;
    }

    public String getTrainingVideo() {
        return trainingVideo;
    }

    public void setTrainingVideo(String trainingVideo) {
        this.trainingVideo = trainingVideo == null ? null : trainingVideo.trim();
    }

    public Integer getMatchTitle() {
        return matchTitle;
    }

    public void setMatchTitle(Integer matchTitle) {
        this.matchTitle = matchTitle;
    }

    public Integer getDeuce() {
        return deuce;
    }

    public void setDeuce(Integer deuce) {
        this.deuce = deuce;
    }

    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    public Integer getLoss() {
        return loss;
    }

    public void setLoss(Integer loss) {
        this.loss = loss;
    }

    public Integer getKo() {
        return ko;
    }

    public void setKo(Integer ko) {
        this.ko = ko;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}