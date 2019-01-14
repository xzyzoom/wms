package com.dsj.wms.entity;

import java.sql.Timestamp;


public class ProduceManagementEntity {
    private int id;
    private String oddNo;
    private Timestamp data;
    private Integer department;
    private String materialName;
    private String unit;
    private Integer quantity;
    private String process;
    private String remark;
    private String pickingMan;
    private String consignee;
    private String pickingCompetent;
    private String propertyDepartment;
    private String reasonForReturn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOddNo() {
        return oddNo;
    }

    public void setOddNo(String oddNo) {
        this.oddNo = oddNo;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPickingMan() {
        return pickingMan;
    }

    public void setPickingMan(String pickingMan) {
        this.pickingMan = pickingMan;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPickingCompetent() {
        return pickingCompetent;
    }

    public void setPickingCompetent(String pickingCompetent) {
        this.pickingCompetent = pickingCompetent;
    }

    public String getPropertyDepartment() {
        return propertyDepartment;
    }

    public void setPropertyDepartment(String propertyDepartment) {
        this.propertyDepartment = propertyDepartment;
    }

    public String getReasonForReturn() {
        return reasonForReturn;
    }

    public void setReasonForReturn(String reasonForReturn) {
        this.reasonForReturn = reasonForReturn;
    }
}
