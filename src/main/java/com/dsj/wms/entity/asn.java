package com.dsj.wms.entity;

import java.util.Date;

public class asn {

    private int id;
    private int documentNo;
    private Date createTime;
    private Date deliveryTime;
    private Date arrivalTime;
    private int supId;
    private int depId;
    private int staId;
    private String transportType;
    private String arrivalAddress;
    private String remarks;
    private String inventoryCode;
    private String inventoryName;
    private String specificationType;
    private String unit;
    private int orderQuantity;
    private int arriveNum;
    private int unArriveNum;
    private int waitSendNum;
    private int packgingNum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(int documentNo) {
        this.documentNo = documentNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSupId() {
        return supId;
    }

    public void setSupId(int supId) {
        this.supId = supId;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public int getStaId() {
        return staId;
    }

    public void setStaId(int staId) {
        this.staId = staId;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getSpecificationType() {
        return specificationType;
    }

    public void setSpecificationType(String specificationType) {
        this.specificationType = specificationType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getArriveNum() {
        return arriveNum;
    }

    public void setArriveNum(int arriveNum) {
        this.arriveNum = arriveNum;
    }

    public int getUnArriveNum() {
        return unArriveNum;
    }

    public void setUnArriveNum(int unArriveNum) {
        this.unArriveNum = unArriveNum;
    }

    public int getWaitSendNum() {
        return waitSendNum;
    }

    public void setWaitSendNum(int waitSendNum) {
        this.waitSendNum = waitSendNum;
    }

    public int getPackgingNum() {
        return packgingNum;
    }

    public void setPackgingNum(int packgingNum) {
        this.packgingNum = packgingNum;
    }


}
