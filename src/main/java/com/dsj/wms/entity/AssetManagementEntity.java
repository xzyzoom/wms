package com.dsj.wms.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "asset_management", schema = "management", catalog = "")
public class AssetManagementEntity {
    private int id;
    private String nameOfMoldTooling;
    private String serialNum;
    private Date acceptanceDates;
    private String dieMaterial;
    private String serviceLife;
    private String applicableEquipment;
    private Integer cavityNum;
    private String mouldMaterial;
    private String maintenancePeriod;
    private String buildingUser;
    private Integer usingDiTtimes;
    private Integer repairsNum;
    private Integer maintenanceCosts;
    private Integer hours;
    private String temperingTime;
    private String manufacturers;
    private String contact;
    private String contactPhone;
    private Integer lastTempering;
    private Date libraryTime;
    private Date storageTime;
    private Integer useNum;
    private String content;
    private Integer cost;
    private Integer shutdownHours;
    private String head;
    private Integer moldsNum;
    private Integer moldsState;
    private Integer departmentId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nameOfMoldTooling")
    public String getNameOfMoldTooling() {
        return nameOfMoldTooling;
    }

    public void setNameOfMoldTooling(String nameOfMoldTooling) {
        this.nameOfMoldTooling = nameOfMoldTooling;
    }

    @Basic
    @Column(name = "serialNum")
    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Basic
    @Column(name = "acceptanceDates")
    public Date getAcceptanceDates() {
        return acceptanceDates;
    }

    public void setAcceptanceDates(Date acceptanceDates) {
        this.acceptanceDates = acceptanceDates;
    }

    @Basic
    @Column(name = "dieMaterial")
    public String getDieMaterial() {
        return dieMaterial;
    }

    public void setDieMaterial(String dieMaterial) {
        this.dieMaterial = dieMaterial;
    }

    @Basic
    @Column(name = "serviceLife")
    public String getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(String serviceLife) {
        this.serviceLife = serviceLife;
    }

    @Basic
    @Column(name = "applicableEquipment")
    public String getApplicableEquipment() {
        return applicableEquipment;
    }

    public void setApplicableEquipment(String applicableEquipment) {
        this.applicableEquipment = applicableEquipment;
    }

    @Basic
    @Column(name = "cavityNum")
    public Integer getCavityNum() {
        return cavityNum;
    }

    public void setCavityNum(Integer cavityNum) {
        this.cavityNum = cavityNum;
    }

    @Basic
    @Column(name = "mouldMaterial")
    public String getMouldMaterial() {
        return mouldMaterial;
    }

    public void setMouldMaterial(String mouldMaterial) {
        this.mouldMaterial = mouldMaterial;
    }

    @Basic
    @Column(name = "maintenancePeriod")
    public String getMaintenancePeriod() {
        return maintenancePeriod;
    }

    public void setMaintenancePeriod(String maintenancePeriod) {
        this.maintenancePeriod = maintenancePeriod;
    }

    @Basic
    @Column(name = "buildingUser")
    public String getBuildingUser() {
        return buildingUser;
    }

    public void setBuildingUser(String buildingUser) {
        this.buildingUser = buildingUser;
    }

    @Basic
    @Column(name = "usingDiTtimes")
    public Integer getUsingDiTtimes() {
        return usingDiTtimes;
    }

    public void setUsingDiTtimes(Integer usingDiTtimes) {
        this.usingDiTtimes = usingDiTtimes;
    }

    @Basic
    @Column(name = "repairsNum")
    public Integer getRepairsNum() {
        return repairsNum;
    }

    public void setRepairsNum(Integer repairsNum) {
        this.repairsNum = repairsNum;
    }

    @Basic
    @Column(name = "maintenanceCosts")
    public Integer getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(Integer maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    @Basic
    @Column(name = "hours")
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Basic
    @Column(name = "temperingTime")
    public String getTemperingTime() {
        return temperingTime;
    }

    public void setTemperingTime(String temperingTime) {
        this.temperingTime = temperingTime;
    }

    @Basic
    @Column(name = "manufacturers")
    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    @Basic
    @Column(name = "contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "contactPhone")
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Basic
    @Column(name = "lastTempering")
    public Integer getLastTempering() {
        return lastTempering;
    }

    public void setLastTempering(Integer lastTempering) {
        this.lastTempering = lastTempering;
    }

    @Basic
    @Column(name = "libraryTime")
    public Date getLibraryTime() {
        return libraryTime;
    }

    public void setLibraryTime(Date libraryTime) {
        this.libraryTime = libraryTime;
    }

    @Basic
    @Column(name = "storageTime")
    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    @Basic
    @Column(name = "useNum")
    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "shutdownHours")
    public Integer getShutdownHours() {
        return shutdownHours;
    }

    public void setShutdownHours(Integer shutdownHours) {
        this.shutdownHours = shutdownHours;
    }

    @Basic
    @Column(name = "head")
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Basic
    @Column(name = "moldsNum")
    public Integer getMoldsNum() {
        return moldsNum;
    }

    public void setMoldsNum(Integer moldsNum) {
        this.moldsNum = moldsNum;
    }

    @Basic
    @Column(name = "moldsState")
    public Integer getMoldsState() {
        return moldsState;
    }

    public void setMoldsState(Integer moldsState) {
        this.moldsState = moldsState;
    }

    @Basic
    @Column(name = "departmentId")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssetManagementEntity that = (AssetManagementEntity) o;
        return id == that.id &&
                Objects.equals(nameOfMoldTooling, that.nameOfMoldTooling) &&
                Objects.equals(serialNum, that.serialNum) &&
                Objects.equals(acceptanceDates, that.acceptanceDates) &&
                Objects.equals(dieMaterial, that.dieMaterial) &&
                Objects.equals(serviceLife, that.serviceLife) &&
                Objects.equals(applicableEquipment, that.applicableEquipment) &&
                Objects.equals(cavityNum, that.cavityNum) &&
                Objects.equals(mouldMaterial, that.mouldMaterial) &&
                Objects.equals(maintenancePeriod, that.maintenancePeriod) &&
                Objects.equals(buildingUser, that.buildingUser) &&
                Objects.equals(usingDiTtimes, that.usingDiTtimes) &&
                Objects.equals(repairsNum, that.repairsNum) &&
                Objects.equals(maintenanceCosts, that.maintenanceCosts) &&
                Objects.equals(hours, that.hours) &&
                Objects.equals(temperingTime, that.temperingTime) &&
                Objects.equals(manufacturers, that.manufacturers) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(contactPhone, that.contactPhone) &&
                Objects.equals(lastTempering, that.lastTempering) &&
                Objects.equals(libraryTime, that.libraryTime) &&
                Objects.equals(storageTime, that.storageTime) &&
                Objects.equals(useNum, that.useNum) &&
                Objects.equals(content, that.content) &&
                Objects.equals(cost, that.cost) &&
                Objects.equals(shutdownHours, that.shutdownHours) &&
                Objects.equals(head, that.head) &&
                Objects.equals(moldsNum, that.moldsNum) &&
                Objects.equals(moldsState, that.moldsState) &&
                Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nameOfMoldTooling, serialNum, acceptanceDates, dieMaterial, serviceLife, applicableEquipment, cavityNum, mouldMaterial, maintenancePeriod, buildingUser, usingDiTtimes, repairsNum, maintenanceCosts, hours, temperingTime, manufacturers, contact, contactPhone, lastTempering, libraryTime, storageTime, useNum, content, cost, shutdownHours, head, moldsNum, moldsState, departmentId);
    }
}
