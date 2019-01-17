package com.dsj.wms.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 人员信息
 */
public class Staff {
    private int id;
    private String staCode;
    private String staName;
    private String staId;
    private int staSex;
    private int staAge;
    private String staPhone;
    private String staEmail;
    private String staAddress;
    private String staPhoto;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date entryDate;
    private int depId;
    private int positionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaCode() {
        return staCode;
    }

    public void setStaCode(String staCode) {
        this.staCode = staCode;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public String getStaId() {
        return staId;
    }

    public void setStaId(String staId) {
        this.staId = staId;
    }

    public int getStaSex() {
        return staSex;
    }

    public void setStaSex(int staSex) {
        this.staSex = staSex;
    }

    public int getStaAge() {
        return staAge;
    }

    public void setStaAge(int staAge) {
        this.staAge = staAge;
    }

    public String getStaPhone() {
        return staPhone;
    }

    public void setStaPhone(String staPhone) {
        this.staPhone = staPhone;
    }

    public String getStaEmail() {
        return staEmail;
    }

    public void setStaEmail(String staEmail) {
        this.staEmail = staEmail;
    }

    public String getStaAddress() {
        return staAddress;
    }

    public void setStaAddress(String staAddress) {
        this.staAddress = staAddress;
    }

    public String getStaPhoto() {
        return staPhoto;
    }

    public void setStaPhoto(String staPhoto) {
        this.staPhoto = staPhoto;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }
}
