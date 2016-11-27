package com.xienan.model;

import java.util.Date;

public class Videoreview {
    private Long videoId;

    private String videoUrl;

    private String videoDescribe;

    private Integer videoComment;

    private Date videoUploadtime;

    private String videoUploader;

    private String videoPlaytime;

    private Date videoInserttime;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoDescribe() {
        return videoDescribe;
    }

    public void setVideoDescribe(String videoDescribe) {
        this.videoDescribe = videoDescribe == null ? null : videoDescribe.trim();
    }

    public Integer getVideoComment() {
        return videoComment;
    }

    public void setVideoComment(Integer videoComment) {
        this.videoComment = videoComment;
    }

    public Date getVideoUploadtime() {
        return videoUploadtime;
    }

    public void setVideoUploadtime(Date videoUploadtime) {
        this.videoUploadtime = videoUploadtime;
    }

    public String getVideoUploader() {
        return videoUploader;
    }

    public void setVideoUploader(String videoUploader) {
        this.videoUploader = videoUploader == null ? null : videoUploader.trim();
    }

    public String getVideoPlaytime() {
        return videoPlaytime;
    }

    public void setVideoPlaytime(String videoPlaytime) {
        this.videoPlaytime = videoPlaytime == null ? null : videoPlaytime.trim();
    }

    public Date getVideoInserttime() {
        return videoInserttime;
    }

    public void setVideoInserttime(Date videoInserttime) {
        this.videoInserttime = videoInserttime;
    }
}