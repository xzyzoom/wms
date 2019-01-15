package com.dsj.wms.entity;

import java.sql.Date;


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
    private Integer loanedNum;
    private String loaneName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getLoanedNum() {
        return loanedNum;
    }

    public void setLoanedNum(Integer loanedNum) {
        this.loanedNum = loanedNum;
    }

    public String getLoaneName() {
        return loaneName;
    }

    public void setLoaneName(String loaneName) {
        this.loaneName = loaneName;
    }

    public String getNameOfMoldTooling() {
        return nameOfMoldTooling;
    }

    public void setNameOfMoldTooling(String nameOfMoldTooling) {
        this.nameOfMoldTooling = nameOfMoldTooling;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public Date getAcceptanceDates() {
        return acceptanceDates;
    }

    public void setAcceptanceDates(Date acceptanceDates) {
        this.acceptanceDates = acceptanceDates;
    }

    public String getDieMaterial() {
        return dieMaterial;
    }

    public void setDieMaterial(String dieMaterial) {
        this.dieMaterial = dieMaterial;
    }

    public String getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(String serviceLife) {
        this.serviceLife = serviceLife;
    }

    public String getApplicableEquipment() {
        return applicableEquipment;
    }

    public void setApplicableEquipment(String applicableEquipment) {
        this.applicableEquipment = applicableEquipment;
    }

    public Integer getCavityNum() {
        return cavityNum;
    }

    public void setCavityNum(Integer cavityNum) {
        this.cavityNum = cavityNum;
    }

    public String getMouldMaterial() {
        return mouldMaterial;
    }

    public void setMouldMaterial(String mouldMaterial) {
        this.mouldMaterial = mouldMaterial;
    }

    public String getMaintenancePeriod() {
        return maintenancePeriod;
    }

    public void setMaintenancePeriod(String maintenancePeriod) {
        this.maintenancePeriod = maintenancePeriod;
    }

    public String getBuildingUser() {
        return buildingUser;
    }

    public void setBuildingUser(String buildingUser) {
        this.buildingUser = buildingUser;
    }

    public Integer getUsingDiTtimes() {
        return usingDiTtimes;
    }

    public void setUsingDiTtimes(Integer usingDiTtimes) {
        this.usingDiTtimes = usingDiTtimes;
    }

    public Integer getRepairsNum() {
        return repairsNum;
    }

    public void setRepairsNum(Integer repairsNum) {
        this.repairsNum = repairsNum;
    }

    public Integer getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(Integer maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getTemperingTime() {
        return temperingTime;
    }

    public void setTemperingTime(String temperingTime) {
        this.temperingTime = temperingTime;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Integer getLastTempering() {
        return lastTempering;
    }

    public void setLastTempering(Integer lastTempering) {
        this.lastTempering = lastTempering;
    }

    public Date getLibraryTime() {
        return libraryTime;
    }

    public void setLibraryTime(Date libraryTime) {
        this.libraryTime = libraryTime;
    }

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getShutdownHours() {
        return shutdownHours;
    }

    public void setShutdownHours(Integer shutdownHours) {
        this.shutdownHours = shutdownHours;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public Integer getMoldsNum() {
        return moldsNum;
    }

    public void setMoldsNum(Integer moldsNum) {
        this.moldsNum = moldsNum;
    }

    public Integer getMoldsState() {
        return moldsState;
    }

    public void setMoldsState(Integer moldsState) {
        this.moldsState = moldsState;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
