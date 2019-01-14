package com.dsj.wms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "produce_management", schema = "management", catalog = "")
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

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "oddNo")
    public String getOddNo() {
        return oddNo;
    }

    public void setOddNo(String oddNo) {
        this.oddNo = oddNo;
    }

    @Basic
    @Column(name = "data")
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "department")
    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    @Basic
    @Column(name = "materialName")
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "process")
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "pickingMan")
    public String getPickingMan() {
        return pickingMan;
    }

    public void setPickingMan(String pickingMan) {
        this.pickingMan = pickingMan;
    }

    @Basic
    @Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    @Basic
    @Column(name = "pickingCompetent")
    public String getPickingCompetent() {
        return pickingCompetent;
    }

    public void setPickingCompetent(String pickingCompetent) {
        this.pickingCompetent = pickingCompetent;
    }

    @Basic
    @Column(name = "propertyDepartment")
    public String getPropertyDepartment() {
        return propertyDepartment;
    }

    public void setPropertyDepartment(String propertyDepartment) {
        this.propertyDepartment = propertyDepartment;
    }

    @Basic
    @Column(name = "reasonForReturn")
    public String getReasonForReturn() {
        return reasonForReturn;
    }

    public void setReasonForReturn(String reasonForReturn) {
        this.reasonForReturn = reasonForReturn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduceManagementEntity that = (ProduceManagementEntity) o;
        return id == that.id &&
                Objects.equals(oddNo, that.oddNo) &&
                Objects.equals(data, that.data) &&
                Objects.equals(department, that.department) &&
                Objects.equals(materialName, that.materialName) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(process, that.process) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(pickingMan, that.pickingMan) &&
                Objects.equals(consignee, that.consignee) &&
                Objects.equals(pickingCompetent, that.pickingCompetent) &&
                Objects.equals(propertyDepartment, that.propertyDepartment) &&
                Objects.equals(reasonForReturn, that.reasonForReturn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, oddNo, data, department, materialName, unit, quantity, process, remark, pickingMan, consignee, pickingCompetent, propertyDepartment, reasonForReturn);
    }
}
