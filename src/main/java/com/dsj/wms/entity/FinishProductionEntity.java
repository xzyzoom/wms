package com.dsj.wms.entity;

import java.sql.Timestamp;
import java.util.Objects;


public class FinishProductionEntity {
    private int id;
    private String orderNo;
    private String productName;
    private String identificationOfProduct;
    private String department;
    private String productionLine;
    private String salesman;
    private String warehouseAddress;
    private Integer orderQuantity;
    private Integer completeNum;
    private Integer notCompletedNum;
    private Integer inspectionNum;
    private Timestamp shippingTime;
    private Timestamp finishDate;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIdentificationOfProduct() {
        return identificationOfProduct;
    }

    public void setIdentificationOfProduct(String identificationOfProduct) {
        this.identificationOfProduct = identificationOfProduct;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Integer getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
    }

    public Integer getNotCompletedNum() {
        return notCompletedNum;
    }

    public void setNotCompletedNum(Integer notCompletedNum) {
        this.notCompletedNum = notCompletedNum;
    }

    public Integer getInspectionNum() {
        return inspectionNum;
    }

    public void setInspectionNum(Integer inspectionNum) {
        this.inspectionNum = inspectionNum;
    }

    public Timestamp getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Timestamp shippingTime) {
        this.shippingTime = shippingTime;
    }

    public Timestamp getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
