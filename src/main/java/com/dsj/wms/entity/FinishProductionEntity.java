package com.dsj.wms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "finish_production", schema = "management", catalog = "")
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

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderNo")
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "identificationOfProduct")
    public String getIdentificationOfProduct() {
        return identificationOfProduct;
    }

    public void setIdentificationOfProduct(String identificationOfProduct) {
        this.identificationOfProduct = identificationOfProduct;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "productionLine")
    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    @Basic
    @Column(name = "salesman")
    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    @Basic
    @Column(name = "warehouseAddress")
    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    @Basic
    @Column(name = "orderQuantity")
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    @Basic
    @Column(name = "completeNum")
    public Integer getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
    }

    @Basic
    @Column(name = "notCompletedNum")
    public Integer getNotCompletedNum() {
        return notCompletedNum;
    }

    public void setNotCompletedNum(Integer notCompletedNum) {
        this.notCompletedNum = notCompletedNum;
    }

    @Basic
    @Column(name = "inspectionNum")
    public Integer getInspectionNum() {
        return inspectionNum;
    }

    public void setInspectionNum(Integer inspectionNum) {
        this.inspectionNum = inspectionNum;
    }

    @Basic
    @Column(name = "shippingTime")
    public Timestamp getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Timestamp shippingTime) {
        this.shippingTime = shippingTime;
    }

    @Basic
    @Column(name = "finishDate")
    public Timestamp getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinishProductionEntity that = (FinishProductionEntity) o;
        return id == that.id &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(identificationOfProduct, that.identificationOfProduct) &&
                Objects.equals(department, that.department) &&
                Objects.equals(productionLine, that.productionLine) &&
                Objects.equals(salesman, that.salesman) &&
                Objects.equals(warehouseAddress, that.warehouseAddress) &&
                Objects.equals(orderQuantity, that.orderQuantity) &&
                Objects.equals(completeNum, that.completeNum) &&
                Objects.equals(notCompletedNum, that.notCompletedNum) &&
                Objects.equals(inspectionNum, that.inspectionNum) &&
                Objects.equals(shippingTime, that.shippingTime) &&
                Objects.equals(finishDate, that.finishDate) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, orderNo, productName, identificationOfProduct, department, productionLine, salesman, warehouseAddress, orderQuantity, completeNum, notCompletedNum, inspectionNum, shippingTime, finishDate, note);
    }
}
