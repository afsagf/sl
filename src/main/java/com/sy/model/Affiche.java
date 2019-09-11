package com.sy.model;

import java.util.Date;

public class Affiche {
    private Long id;

    private String code;
    private Integer state;

    private String title;

    private String publisher;

    private Date publishTime;

    private Date startTime;

    private Date endTime;

    private String content;

    @Override
    public String toString() {
        return "Affiche{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", state=" + state +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishTime=" + publishTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}