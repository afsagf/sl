package com.sy.model;

import java.util.Date;

public class Info_annexes {
    private String id;

    private String info_Id;

    private String name;

    private String url;

    private String state;

    private String type;

    private Date upload_Time;

    private Integer size;

    @Override
    public String toString() {
        return "Info_annexes{" +
                "id='" + id + '\'' +
                ", info_Id='" + info_Id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", upload_Time=" + upload_Time +
                ", size=" + size +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo_Id() {
        return info_Id;
    }

    public void setInfo_Id(String info_Id) {
        this.info_Id = info_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getUpload_Time() {
        return upload_Time;
    }

    public void setUpload_Time(Date upload_Time) {
        this.upload_Time = upload_Time;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}