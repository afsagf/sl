package com.sy.model;

import java.util.Date;
import java.util.List;

public class Au_function {
    private Long id;

    private String functionCode;

    private String functionName;

    private String funcUrl;

    private Long parentId;

    private Date creationTime;

    private List<Au_function> secAuFunction;

    @Override
    public String toString() {
        return "Au_function{" +
                "id=" + id +
                ", functionCode='" + functionCode + '\'' +
                ", functionName='" + functionName + '\'' +
                ", funcUrl='" + funcUrl + '\'' +
                ", parentId=" + parentId +
                ", creationTime=" + creationTime +
                ", secAuFunction=" + secAuFunction +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public List<Au_function> getSecAuFunction() {
        return secAuFunction;
    }

    public void setSecAuFunction(List<Au_function> secAuFunction) {
        this.secAuFunction = secAuFunction;
    }
}